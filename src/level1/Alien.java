package level1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject {
	public Alien(int x, int y, int width, int height) {
		super();
		this.x = x;
		if (this.x<25) {
			this.x=25;
		} if (this.x>425) {
			this.x=425;
		}
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		super.update();
		y++;
		int random = new Random().nextInt(10);
		int rand = new Random().nextInt(5);
		if (random%2==1) {
			x+=rand;
		} else {
			x-=rand;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}
}
