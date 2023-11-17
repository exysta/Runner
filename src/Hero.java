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
    public  void update(){
        if ((this.attitude%2== 0)){ //les lignes du spritesheet avec 6 sprites d'animation
            if (this.index < 5) {
                this.index += 1;
                this.animation.setViewport(new Rectangle2D( index * 85,attitude*150,80,100));
                if(x_animation>=1600){
                    x_animation=0;
                }
                else {
                    x_animation += 15;
                }
                this.animation.setX(x_animation);

            }
            else{
                this.index = 0;
                this.animation.setViewport(new Rectangle2D( index * 85,attitude*150,80,100));
                if(x_animation>=1600){
                    x_animation=0;
                }
                else {
                    x_animation += 15;
                }
                this.animation.setX(x_animation);

            }
        }
        if ((this.attitude%2== 1)){
            if (this.index < 1) {
                this.index += 1;
                this.animation.setViewport(new Rectangle2D( index * 85,attitude*150,80,100));
                if(x_animation>=1600){
                    x_animation=0;
                }
                else {
                    x_animation += 15;
                }
                this.animation.setX(x_animation);

            }
            else{
                this.index = 0;
                this.animation.setViewport(new Rectangle2D( index * 85,attitude*150,80,100));
                if(x_animation>=1600){
                    x_animation=0;
                }
                else {
                    x_animation += 15;
                }
                this.animation.setX(x_animation);

            }
        }
    }

}
