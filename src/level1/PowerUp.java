package level1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class PowerUp extends GameObject {
	int rotation;
	boolean passPlayer;

	public PowerUp(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.y = y;
		this.width = width;
		this.height = height;
		rotation = 0;
	}

	void update() {
		super.update();
		y+=3;
	}

	void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		AffineTransform oldRotation = g2.getTransform();
		AffineTransform newRotation = new AffineTransform();
		rotation += 1;
		newRotation.rotate(rotation, x + (width / 2), y + (height / 2));
		g2.setColor(Color.GREEN);
		g2.setTransform(newRotation);
		g2.draw3DRect(x, y, width, height, true);
		g2.setTransform(oldRotation);
		if (rotation > 360) {
			rotation -= 360;
		}

	}

	}

