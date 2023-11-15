
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.time.Duration;

public class GameScene extends Scene {
    public static StaticThing[] lives;
    public static Hero hero;
    public static StaticThing background_r;
    public GameCamera cam;
    public int numberOfLives;

    public GameScene(Parent parent,int camX,int camY,double b_l_X,double b_l_Y,double b_r_X,double b_r_Y){
        super(parent,1600, 600, true);
        lives = new StaticThing[] {new StaticThing("Ressources/heart.png",b_l_X,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+30,b_l_Y),new StaticThing("Ressources/heart.png",b_l_X+60,b_l_Y)};
        hero = new Hero(400,495,0,1);
        background_r = new StaticThing("Ressources/Score.png",b_r_X,b_r_Y);
        cam=new GameCamera(camX,camY);
        this.numberOfLives=3;
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


    public static StaticThing getBackground_r() {
        return background_r;
    }
    public void render(){

    }
}