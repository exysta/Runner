import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class EnemySpawner {
    private double screenWidth;
    private double screenHeight;
    private double enemyHitbox;
    public ArrayList<Alien> aliensList;

    private Random random = new Random();

    public EnemySpawner(double enemyHitbox) {
        this.screenWidth = 1600*50;//1600= fenetre affiché,50= nombre de background défilant
        this.screenHeight = 600;
        this.enemyHitbox = enemyHitbox;
        this.aliensList = new ArrayList<Alien>();
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
        ArrayList<ImageView> ImageAlienList = new ArrayList<ImageView>();
        for(int i=0;i<149;i++){
            SpawnEnemy();
            //aliensList.add(SpawnEnemy());
            ImageAlienList.add(SpawnEnemy().getAnimation());
        }
        return ImageAlienList;
    }

    public ArrayList<Alien> getAliensList() {
        return aliensList;
    }
}