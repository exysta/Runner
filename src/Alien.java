import javafx.geometry.Rectangle2D;

import java.util.Random;

public class Alien extends AnimatedThings {
    public Alien(double x_animation, double y_animation, int attitude, int index) {
        super(x_animation, y_animation, attitude, index, "Ressources/img/alien.png");
    }
    public class EnemySpawner {
        private double screenWidth;
        private double screenHeight;
        private double enemyHitbox;

        private Random random = new Random();
        public Alien alien;

        public EnemySpawner(double enemyHitbox) {
            this.screenWidth = 1600;
            this.screenHeight = 600;
            this.enemyHitbox = enemyHitbox;
        }

        public double generateRandomX() {
            return random.nextDouble() * (screenWidth - 2 * enemyHitbox) + enemyHitbox;
        }

        public double generateRandomY() {
            return random.nextDouble() * (screenHeight - 2 * enemyHitbox) + enemyHitbox;
        }

        public void SpawnEnemy(){
            double alienX = generateRandomX();
            double alienY = generateRandomY();
            int alienAttitude = 0;
            int alienIndex = 0; // coresspond à la frame de l'animation déterminé par l'attitude
            Alien alien = new Alien(alienX,alienY,alienAttitude,alienIndex);

        }
    }
    public void update(Alien alien){
        if((this.attitude== 0)){ //alien vivant
            if (this.index < 3) {
                this.index += 1;
            }
            else{
                this.index = 0;
            }
            this.animation.setViewport(new Rectangle2D( index * 84,attitude*165,80,100));

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



