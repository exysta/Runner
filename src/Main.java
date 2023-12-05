import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


import javafx.stage.Stage;


public class Main extends Application {
    @Override
public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Runner");

        Group landscape = new Group();
        Group HeroGroup = new Group();
        Group EnnemyGroup = new Group();

        Group Ui = new Group();
        HBox Media = new HBox();
        Media.setLayoutX(1475);

        Pane pane = new Pane(landscape,Ui,HeroGroup,Media,EnnemyGroup);
        GameScene theScene = new GameScene(pane,40,40,1400,0);

        Ui.getChildren().addAll(GameScene.getLives()[0].getImage(),GameScene.getLives()[1].getImage(),GameScene.getLives()[2].getImage(),GameScene.getTimerLabel());
        HeroGroup.getChildren().add(GameScene.getHero().getAnimation());
        EnnemyGroup.getChildren().addAll(GameScene.getEnemiesList());
        Media.getChildren().addAll(GameScene.getMusicPlayer().getPlayButton(),GameScene.getMusicPlayer().getPauseButton(),GameScene.getMusicPlayer().getStopButton());
        landscape.getChildren().add(GameScene.getBackground());



        primaryStage.setScene(theScene);
        primaryStage.show();
        }
         public static void main(String[] args) {
         launch(args);
         }
 }