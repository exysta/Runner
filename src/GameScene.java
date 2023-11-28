
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;


public class GameScene extends Scene {
    public static StaticThing[] lives;
    public int numberOfLives;

    public static Hero hero;
    public static Group background;

    public static Camera cam;
    public static Label timerLabel;
    public AnimationTimer timer;
    public AnimationTimer timer_background;
    private Parent root;

    public static MusicPlayer musicPlayer;

    public GameScene(Parent parent,double b_l_X,double b_l_Y,double b_r_X,double b_r_Y){
        super(parent,1600, 600, true);
        lives = new StaticThing[] {new StaticThing("Ressources/heart.png",b_l_X,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+30,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+60,b_l_Y)};
        hero = new Hero(400,490,2,0);
        background = Space.Create_Space();
        cam=new Camera(0,0, hero.x_animation, hero.y_animation);
        root = getRoot();
        this.numberOfLives=3;
        timerLabel = new Label("Timer: 0");
        timerLabel.setStyle("-fx-font-size: 32pt; -fx-text-fill: red;");

        musicPlayer = new MusicPlayer("Ressources/sound/Mercury.wav");


        // 1er timer pour l'animation du héro trigger 0.1 sec
        timer = new AnimationTimer() {
            private long lastTime = 0;
            private long previousTime;


            @Override
            public void handle(long now) {
                if (lastTime == 0) {
                    lastTime = now;
                    previousTime =now;
                }
                long elapsedTime = now - lastTime;
                if ((now-previousTime)/1_000_000_00 >=1){
                    hero.update();
                    previousTime = now;
                }
                long seconds = elapsedTime / 1_000_000_000;
                timerLabel.setText("Timer: " + seconds);
            }
        };
        //2 eme timer qui va 10x plus vite pour un déplacement de l'arrière-plan plus fluide
        timer_background = new AnimationTimer() {
            private long previousTime_background;
            private long lastTime_background = 0;
            @Override
            public void handle(long now) {
                if (lastTime_background == 0) {
                    lastTime_background = now;
                    previousTime_background =now;
                }
                if ((now-previousTime_background)/1_000_000_0 >=1){
                    cam.update();
                    hero.GravityUpdate((now-previousTime_background)/1_000_000_0);
                    GameScene.update();
                    previousTime_background = now;
                }
            }
        };
        this.setOnMouseClicked( (event)->{
            System.out.println("fire !");
            hero.fire();
        });
        this.setOnKeyPressed( (event)->{
            System.out.println("Jump");
            hero.jump();
        });
        timer.start();
        timer_background.start();

    }

    public static Group getBackground() {
        return background;
    }

    public static StaticThing[] getLives() {
        return lives;
    }

    public static Hero getHero() {
        return hero;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public static Label getTimerLabel() {
        return timerLabel;
    }

    public static void update(){

        background.setLayoutX(-cam.getXCam());
        //hero.y_animation += cam.YHero;
        hero.animation.setY(hero.y_animation);
    }

    public static MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }
}