import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class EnemySpawner {
    private final double screenWidth;
    private final double screenHeight;
    private final double enemyHitbox;

    private Random random = new Random();

    public EnemySpawner(double enemyHitbox) {
        this.screenWidth = 1600*50;//1600= fenetre affiché,50= nombre de background défilant
        this.screenHeight = 600;
        this.enemyHitbox = enemyHitbox;
    }

    public double generateRandomX() {
        return random.nextDouble() * (screenWidth - 2 * enemyHitbox) + enemyHitbox;
    }

    public double generateRandomY() {
        return random.nextDouble() * (screenHeight - 2 * enemyHitbox) + enemyHitbox;
    }

    public Alien SpawnEnemy(){
        double alienX = generateRandomX();
        double alienY = generateRandomY();
        int alienAttitude = 0;
        int alienIndex = 0; // coresspond à la frame de l'animation déterminé par l'attitude
        return new Alien(alienX,alienY,alienAttitude,alienIndex);
    }
    public ArrayList<ImageView> SpawnAllEnemies(){
        ArrayList<ImageView> ImageAlienList = new ArrayList<>();
        for(int i=0;i<149;i++){
            SpawnEnemy();
            ImageAlienList.add(SpawnEnemy().getAnimation());
        }
        return ImageAlienList;
    }


}