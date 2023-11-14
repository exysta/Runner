import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.Duration;
import java.util.ArrayList;

public abstract class AnimatedThings {
    public double x_animation;
    public double y_animation;
    public ImageView animation;
    public int attitude;
    public final Duration frame_duration;
    public final int frame_offset;

    public int index;
    public final int max_index;
    public final ArrayList<Integer> window_size;

    public AnimatedThings(double x_animation, double y_animation, int attitude,
                          Duration frame_duration, int frame_offset, int index, int max_index,
                          ArrayList<Integer> window_size,String fileName) {
        this.x_animation = x_animation;
        this.y_animation = y_animation;
        this.attitude = attitude;
        this.frame_duration = frame_duration;
        this.frame_offset = frame_offset;
        this.index = index;
        this.max_index = max_index;
        this.window_size = window_size;
        animation = new ImageView(new Image(fileName));
        animation.setViewport(new Rectangle2D(window_size.get(0)+50,window_size.get(0)+window_size.get(1)/2,65,100));
        animation.setX(x_animation);
        animation.setY(y_animation);

    }

    public ImageView getAnimation() {
        return animation;
    }
}

