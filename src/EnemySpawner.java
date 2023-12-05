import java.util.Random;

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
        this.alien = new Alien(alienX,alienY,alienAttitude,alienIndex);

    }
}