import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {
    public static StaticThing heart1;
    public static StaticThing heart2;
    public static StaticThing heart3;

    public static StaticThing background_r;
    public GameCamera cam;
    public int numberOfLives;

    public GameScene(Parent parent, double v, double v1, boolean b,int camX,int camY,double b_l_X,double b_l_Y,double b_r_X,double b_r_Y){
        super(parent, v, v1, b);
        heart1 = new StaticThing("heart.png",b_l_X,b_l_Y);
        heart2 = new StaticThing("heart.png",b_l_X+30,b_l_Y);
        heart3 = new StaticThing("heart.png",b_l_X+60,b_l_Y);

        background_r = new StaticThing("Score.png",b_r_X,b_r_Y);
        cam=new GameCamera(camX,camY);
        this.numberOfLives=3;
    }

    public static StaticThing getHeart1() {
        return heart1;
    }

    public static StaticThing getHeart2() {
        return heart2;
    }

    public static StaticThing getHeart3() {
        return heart3;
    }

    public static StaticThing getBackground_r() {
        return background_r;
    }
    public void render(){

    }
}