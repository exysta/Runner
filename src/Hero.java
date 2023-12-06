import javafx.geometry.Rectangle2D;


public class Hero extends AnimatedThings {
    double vY = 0;
    public Hero(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index,"Ressources/heros.png");

        this.animation.setViewport(new Rectangle2D( index * 85,attitude*161,80,100));
        this.animation.setX(x_animation);
        this.animation.setY(y_animation);
    }
    public  void update(){ // on update juste le sprite du héro, la physique est fait dans la partie caméra et Gamescene avec un taux de rafraichissement plus élévé pour + de fluidité
        if ((this.attitude%2== 0)){ //les lignes du spritesheet avec 6 sprites d'animation
            if (this.index < 5) {
                this.index += 1;
                this.animation.setViewport(new Rectangle2D( index * 84,attitude*165,80,100));

                if(index==5){this.animation.setViewport(new Rectangle2D( index * 83,attitude*165,200,100));}

            }
            else{
                this.index = 0;
                if (attitude==2){ // s'il a fini de tiré on le remet à courir normalement
                    attitude =0;
                }
                this.animation.setViewport(new Rectangle2D( index,attitude*160,80,100));
            }
        }
        if ((this.attitude%2== 1)){
            if (this.index < 1) {
                this.index += 1;
                this.animation.setViewport(new Rectangle2D( index * 85,attitude*160,80,100));
            }
            else{
                this.index = 0;
                this.animation.setViewport(new Rectangle2D( index,attitude*160,80,100));
            }
        }
    }
    public void jump(){
        attitude = 1;
        index = 0;
        update();
        vY -= 3;
    }
    public void fire(){
        if(y_animation>=485) { // du moment que le héros n'est que légerement au dessus du sol il fait l'animation du tire normal
            attitude = 2;
            index = 0;
        }
        else{ //il fait l'animation de saut + tire s'il n'est pas au sol quand il tire
            attitude = 3;
            index = 0;
        }
        update();
    }
    public void GravityUpdate(double deltatime){
        //adding gravity
        double aY;
        if((vY>=0)&&(y_animation>=400)){ // increased gravity when falling down near ground
            aY=0.12;
        }
        else{
            aY=0.07; // resotring to inital value if not descending near ground
        }

        if((y_animation += vY * deltatime) > 490) {
            y_animation=490;
            vY = 0;
            if (attitude%2==1) {
                attitude = 0;
            }
        }
        else {
            vY += aY * deltatime ;
            y_animation += vY * deltatime;
        }

    }

}
