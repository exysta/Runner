import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    public double sizeX;
    public double sizeY;
    public ImageView imageview;

    public StaticThing(String fileName,double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        this.imageview = new ImageView(new Image(fileName));
        this.imageview.setX(sizeX);
        this.imageview.setY(sizeY);
    }

    public ImageView getImage() {
        return imageview;
    }
}
