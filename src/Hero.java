import javafx.scene.image.ImageView;

import java.time.Duration;
import java.util.ArrayList;

public class Hero extends AnimatedThings {
    public Hero(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index, 16, "Ressources\\heros.png");
    }

}
