
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
    public static Hero hero;
    public static StaticThing background_r;
    public GameCamera cam;
    public static Label timerLabel;
    public AnimationTimer timer;
    public int numberOfLives;
    private long lastTime;

    public GameScene(Parent parent,int camX,int camY,double b_l_X,double b_l_Y,double b_r_X,double b_r_Y){
        super(parent,1600, 600, true);
        lives = new StaticThing[] {new StaticThing("Ressources/heart.png",b_l_X,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+30,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+60,b_l_Y)};
        hero = new Hero(400,495,0,5);
        background_r = new StaticThing("Ressources/Score.png",b_r_X,b_r_Y);
        cam=new GameCamera(camX,camY);
        this.numberOfLives=3;

        timerLabel = new Label("Timer: 0");
        timerLabel.setStyle("-fx-font-size: 32pt; -fx-text-fill: red;");
        lastTime =0;
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (lastTime == 0) {
                    lastTime = now;
                }
                long elapsedTime = now - lastTime;

                //hero.update(hero);
                //camera.update(time);
                //gameScene.update(time);
                long seconds = elapsedTime / 1_000_000_000;
                timerLabel.setText("Timer: " + seconds);            }
        };
        timer.start();
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

    public static StaticThing getBackground_r() {
        return background_r;
    }
    public void render(){
    }


}