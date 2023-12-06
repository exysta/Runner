import javafx.geometry.Rectangle2D;


public class Alien extends AnimatedThings {
    public Alien(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index, "Ressources/alienSpriteSheet-transformed.png");
        this.animation.setViewport(new Rectangle2D( 0,15,60,90));
        this.animation.setX(x_animation);
        this.animation.setY(y_animation);
    }

    public void update(){
        if((this.attitude== 0)){ //alien vivant
            if (this.index < 3) {
                this.index += 1;
            }
            else{
                this.index = 0;
            }
            this.animation.setViewport(new Rectangle2D( index * 60,15+attitude*90,60,90));

        }
        if ((this.attitude== 1)){ //alien meurt
            if (this.index < 1) {
                this.index += 1;

            }
            else{
                this.index = 0;
                this.animation.setViewport(new Rectangle2D( index * 60,15+attitude*90,60,90));
            }
            this.animation.setViewport(new Rectangle2D( index * 60,15+attitude*90,60,90));
        }
    }
}



