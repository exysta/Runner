import javafx.geometry.Rectangle2D;

import java.util.Random;

public class Alien extends AnimatedThings {
    public Alien(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index, "Ressources/heart.png");
        //this.animation.setViewport(new Rectangle2D( 0,0,75,75));
        this.animation.setX(x_animation);
        this.animation.setY(y_animation);
    }

    public void update(Alien alien){
        if((this.attitude== 0)){ //alien vivant
            if (this.index < 3) {
                this.index += 1;
            }
            else{
                this.index = 0;
            }
            this.animation.setViewport(new Rectangle2D( 1+index * 30,10+attitude*50,80,100));

        }
        if ((this.attitude== 1)){ //alien meurt
            if (this.index < 1) {
                this.index += 1;

            }
            else{
                this.index = 0;
                this.animation.setViewport(new Rectangle2D( index * 85,attitude*160,80,100));
            }
            this.animation.setViewport(new Rectangle2D( index * 85,attitude*160,80,100));
        }
    }
}



