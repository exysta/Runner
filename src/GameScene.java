import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {
    public static StaticThing background_l;
    public static StaticThing background_r;

    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
        this.background_l = new StaticThing("heart.png",40,40);
        this.background_r = new StaticThing("Score.png",1300,0);

    }

    public static StaticThing getBackground_l() {
        return background_l;
    }

    public static StaticThing getBackground_r() {
        return background_r;
    }

    public void render(Camera cam){

    }
}