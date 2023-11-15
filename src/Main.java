import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class Main extends Application {
//https://zetcode.com/gui/javafx/animation/
        @Override
public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Runner");
        Image spriteSheet = new Image("Ressources/space.png");
        Image spriteSheet2 = new Image("Ressources/space2.png");
        ImageView sprite1 = new ImageView(spriteSheet);
        ImageView sprite2 = new ImageView(spriteSheet2);
        sprite1.setX(0);
        sprite1.setY(0);

        sprite2.setX(1600);
        sprite2.setY(0);

        Path path = new Path();
        Group root = new Group(sprite1,sprite2);
        Group HeroGroup = new Group();
        Pane pane = new Pane(root,HeroGroup);
        GameScene theScene = new GameScene(pane,0,0,40,40,1400,0);

        root.getChildren().addAll(GameScene.getLives()[0].getImage(),GameScene.getLives()[1].getImage(),GameScene.getLives()[2].getImage(),GameScene.getBackground_r().getImage());
        HeroGroup.getChildren().add(GameScene.getHero().getAnimation());
        primaryStage.setScene(theScene);
        primaryStage.show();
        }
         public static void main(String[] args) {
         launch(args);
         }
 }