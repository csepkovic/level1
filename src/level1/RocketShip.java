
package level1;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
int speed;
int projectileSize;
int projectileSpeed;
	public RocketShip(int x, int y, int width, int height, int speed, int projectileSpeed) {
		super(x, y, width, height);
		this.speed = speed;
		this.projectileSpeed = projectileSpeed;
	}

	void update() {
		super.update();
		x+=speed;
	}

	void draw(Graphics g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(x, y, width, height);
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
	}
}
