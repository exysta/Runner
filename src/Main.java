import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Path;
import javafx.stage.Stage;


public class Main extends Application {
//https://zetcode.com/gui/javafx/animation/
        @Override
public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Runner");

        Space space = new Space();
        Group landscape = space.Create_Space();
        Group HeroGroup = new Group();
        Group Ui = new Group();

        Label test = new Label("coucou");

        Pane pane = new Pane(landscape,Ui,HeroGroup);
        GameScene theScene = new GameScene(pane,0,0,40,40,1400,0);

        Ui.getChildren().addAll(GameScene.getLives()[0].getImage(),GameScene.getLives()[1].getImage(),GameScene.getLives()[2].getImage(),GameScene.getTimerLabel(),test);
        HeroGroup.getChildren().add(GameScene.getHero().getAnimation());

        primaryStage.setScene(theScene);
        primaryStage.show();
        }
         public static void main(String[] args) {
         launch(args);
         }
 }