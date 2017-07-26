package level1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.Random;

public class Alien extends GameObject {
	int rotation;
	boolean passPlayer;
	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.x = x;
		if (this.x<25) {
			this.x=25;
		} if (this.x>425) {
			this.x=425;
		}
		this.y = y;
		this.width = width;
		this.height = height;
		rotation = 0;
		passPlayer = false;
	}

	void update() {
		super.update();
		y+=5;
		int random = new Random().nextInt(10);
		int random1 = new Random().nextInt(5);
		if (random%2==1) {
			x+=random1;
		} else {
			x-=random1;
		} if (y>800) {
			passPlayer = true;
		}
	}

	void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		AffineTransform oldRotation = g2.getTransform();
		AffineTransform newRotation = new AffineTransform();
		rotation+=177;
		newRotation.rotate(rotation, x+(width/2), y+(height/2));
		g2.setColor(Color.RED);
		g2.setTransform(newRotation);
		g2.drawRect(x, y, width, height);
		g2.setTransform(oldRotation);
		if (rotation>360) {
			rotation-=360;
		}
	}
}
