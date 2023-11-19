
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.time.Duration;
import java.util.ArrayList;

public class GameScene extends Scene {
    public static StaticThing[] lives;
    public int numberOfLives;

    public static Hero hero;
    public static Group background;

    public static Camera cam;
    public static Label timerLabel;
    public AnimationTimer timer;
    public AnimationTimer timer_background;

    public GameScene(Parent parent,double b_l_X,double b_l_Y,double b_r_X,double b_r_Y){
        super(parent,1600, 600, true);
        lives = new StaticThing[] {new StaticThing("Ressources/heart.png",b_l_X,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+30,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+60,b_l_Y)};
        hero = new Hero(400,495,0,0);
        background = Space.Create_Space();
        cam=new Camera(0,0);
        this.numberOfLives=3;

        timerLabel = new Label("Timer: 0");
        timerLabel.setStyle("-fx-font-size: 32pt; -fx-text-fill: red;");

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
                    GameScene.update();
                    previousTime_background = now;
                }
            }
        };
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


    public void render(){

    }

    public static void update(){
        background.setLayoutX(-cam.getX());
    }

}