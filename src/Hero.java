import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

import java.time.Duration;
import java.util.ArrayList;

public class Hero extends AnimatedThings {
    public Hero(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index,"Ressources/heros.png");

        this.animation.setViewport(new Rectangle2D( index * 85,attitude*150,80,100));
        this.animation.setX(x_animation);
        this.animation.setY(y_animation);
    }
    public Hero update(Hero hero){
        if ((hero.attitude%2== 0)){
            if (hero.index < 5) {
                hero.index += 1;
            }
            else{
                hero.index = 0;
            }
        }
        if ((hero.attitude%2== 1)){
            if (hero.index < 1) {
                hero.index += 1;
            }
            else{
                hero.index = 0;
            }
        }
        return hero;
    }
}
