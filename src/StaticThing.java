import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    public double sizeX;
    public double sizeY;
    public ImageView imageview;
    public String fileName;

    public StaticThing(String fileName,double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fileName= fileName;

        this.imageview = new ImageView(new Image(fileName));
        this.imageview.setX(sizeX);
        this.imageview.setY(sizeY);
    }
    public void DispStatic(){

    }
    public ImageView getImage() {
        return imageview;
    }
}
