import javafx.scene.image.ImageView;

import java.time.Duration;
import java.util.ArrayList;

public class Hero extends AnimatedThings {
    public Hero(double x, double y, int attitude,
                Duration frame_duration, int frame_offset,
                int index, int max_index,
                ArrayList<Integer> window_size,
                String fileName) {
        super(x, y, attitude, frame_duration=Duration.ofMillis((long) 500), frame_offset, index, max_index, window_size, "hero.png");
    }
}
