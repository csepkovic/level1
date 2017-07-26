package level1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<GameObject> objects;

	private int score = 0;

	long enemyTimer = 0;
	int enemySpawnTime = 250;
	int powerUpSpawnTime = 2000;

	public ObjectManager() {
		objects = new ArrayList<GameObject>();
	}

	public void addObject(GameObject o) {
		objects.add(o);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.update();
			if (o instanceof Alien) {
				if (((Alien) o).passPlayer) {
					score -= 10;
					o.isAlive = false;
					System.out.println(score);
				}
			}
		}

		purgeObjects();
	}

	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			GameObject o = objects.get(i);
			o.draw(g);
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addObject(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));
			enemyTimer = System.currentTimeMillis();
			enemySpawnTime--;
		}
	}
	
	public void managePowerUps() {
		if (System.currentTimeMillis() - enemyTimer >= powerUpSpawnTime) {
			addObject(new PowerUp(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));
			enemyTimer = System.currentTimeMillis();
		}
	}

	public void checkCollision() {
		for (int i = 0; i < objects.size(); i++) {
			for (int j = i + 1; j < objects.size(); j++) {
				GameObject o1 = objects.get(i);
				GameObject o2 = objects.get(j);

				if (o1.collisionBox.intersects(o2.collisionBox)) {
					if ((o1 instanceof Alien && o2 instanceof Projectile)
							|| (o2 instanceof Alien && o1 instanceof Projectile)) {
						score+=10;
						enemySpawnTime++;
						System.out.println(score);
						o1.isAlive = false;
						o2.isAlive = false;
					} else if ((o1 instanceof Alien && o2 instanceof RocketShip)
							|| (o2 instanceof Alien && o1 instanceof RocketShip)) {
						o1.isAlive = false;
						o2.isAlive = false;
					} else if ((o1 instanceof PowerUp && o2 instanceof RocketShip)) {
						o1.isAlive = false;
						// o2.projectileSpeed+=10;
					} else if ((o2 instanceof PowerUp && o1 instanceof RocketShip)) {
						o2.isAlive = false;
						// o2.projectileSpeed+=10;
					}
				}
			}
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int s) {
		score = s;
	}

	public void reset() {
		objects.clear();
	}
}
