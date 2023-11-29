import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.Duration;
import java.util.ArrayList;

public  class AnimatedThings {
    public double x_animation;
    public double y_animation;
    public ImageView animation;
    public int attitude;
    public final Duration frame_duration;
    public final int frame_offset;

    public int index;
    public final int max_index;

    public AnimatedThings(double x_animation, double y_animation, int attitude,
                           int index
                          ,String fileName) {
        this.x_animation = x_animation;
        this.y_animation = y_animation;
        this.attitude = attitude;
        this.frame_duration = Duration.ofMillis(500);
        this.frame_offset = 0;
        this.index = index;
        this.max_index = 6;
        this.animation = new ImageView(new Image(fileName));

    }

    public ImageView getAnimation() {
        return animation;
    }


}

