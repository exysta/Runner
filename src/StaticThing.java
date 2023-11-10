import javafx.scene.image.ImageView;

public class StaticThing {
    public double sizeX;
    public double sizeY;
    public ImageView image;
    public String fileName;

    public StaticThing(String fileName,double sizeX, double sizeY, ImageView image) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.image = image;
        this.fileName= fileName;
    }

    public ImageView getImage() {
        return image;
    }
}
