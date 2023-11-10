import javafx.scene.Camera;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {
    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }
    public StaticThing background_l;
    public StaticThing background_r;

    public void render(Camera cam){

    }

}
