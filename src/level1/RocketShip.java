
package level1;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
int speed;
	public RocketShip(int x, int y, int width, int height, int speed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
	}

	void update() {
		x+=speed;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
