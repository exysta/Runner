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
    @Override
public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Runner");

        Group landscape = new Group();
        Group HeroGroup = new Group();
        Group Ui = new Group();

        Pane pane = new Pane(landscape,Ui,HeroGroup);
        GameScene theScene = new GameScene(pane,40,40,1400,0);

        Ui.getChildren().addAll(GameScene.getLives()[0].getImage(),GameScene.getLives()[1].getImage(),GameScene.getLives()[2].getImage(),GameScene.getTimerLabel());
        HeroGroup.getChildren().add(GameScene.getHero().getAnimation());

        landscape.getChildren().add(GameScene.getBackground());



        primaryStage.setScene(theScene);
        primaryStage.show();
        }
         public static void main(String[] args) {
         launch(args);
         }
 }