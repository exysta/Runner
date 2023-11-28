import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;


public class MusicPlayer {
    private MediaPlayer mediaPlayer;
    public Button playButton;
    public Button pauseButton;
    public Button stopButton;

    public MusicPlayer(String mediaPath) {
        Media media = new Media(new File(mediaPath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        initializeControls();
    }

    private void initializeControls() {

        playButton = new Button("Play");
        playButton.setOnAction(e -> {
            mediaPlayer.play();
            mediaPlayer.setOnEndOfMedia(() -> mediaPlayer.seek(Duration.ZERO));
        });

        pauseButton = new Button("Pause");
        pauseButton.setOnAction(e -> mediaPlayer.pause());

        stopButton = new Button("Stop");
        stopButton.setOnAction(e -> {
            mediaPlayer.stop();
            mediaPlayer.setOnEndOfMedia(null); // Remove the loop when stopped
        });
    }

    public  Button getPlayButton() {
        return playButton;
    }

    public  Button getPauseButton() {
        return pauseButton;
    }

    public Button getStopButton() {
        return stopButton;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
}
