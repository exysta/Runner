import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {

    Camera cam = new Camera(0,0);


    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
        this.cam = cam;
    }


}
