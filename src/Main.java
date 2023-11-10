import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

        @Override
public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello world");
        Image spriteSheet = new Image("space.png");
        Image spriteSheet2 = new Image("space2.png");
        ImageView sprite1 = new ImageView(spriteSheet);
        ImageView sprite2 = new ImageView(spriteSheet2);
        ArrayList <ImageView> sprites= new ArrayList<ImageView>();
        sprite1.setImage(spriteSheet);
        sprite1.setX(-800);
        sprite1.setY(0);

        sprite2.setImage(spriteSheet2);
        sprite2.setX(800);
        sprite2.setY(0);

        Group root = new Group(sprite1,sprite2);
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 1600, 600,true);
        primaryStage.setScene(theScene);
        primaryStage.show();
        }
         public static void main(String[] args) {
         launch(args);
         }
 }