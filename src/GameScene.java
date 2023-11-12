import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {
    public static StaticThing background_l;
    public static StaticThing background_r;
    public static GameCamera cam;
    public int numberOfLives;

    public GameScene(Parent parent, double v, double v1, boolean b,int camX,int camY,double b_l_X,double b_l_Y,double b_r_X,double b_r_Y){
        super(parent, v, v1, b);
        this.background_l = new StaticThing("heart.png",b_l_X,b_l_Y);
        this.background_r = new StaticThing("Score.png",b_r_X,b_r_Y);
        this.cam=new GameCamera(camX,camY);
        this.numberOfLives=3;
    }

    public static StaticThing getBackground_l() {
        return background_l;
    }

    public static StaticThing getBackground_r() {
        return background_r;
    }
    public void render(){

    }
}