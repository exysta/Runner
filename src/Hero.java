import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

import java.time.Duration;
import java.util.ArrayList;

public class Hero extends AnimatedThings {
    public Hero(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index, 6, "Ressources/heros.png");

        this.animation.setViewport(new Rectangle2D(20+ index * 75,attitude*150,65,100));
        this.animation.setX(x_animation);
        this.animation.setY(y_animation);
    }

}
