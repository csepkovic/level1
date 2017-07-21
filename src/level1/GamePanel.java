package level1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font pressEnter;
	Font pressSpace;
	Font G;
	Font A;
	Font M;
	Font E;
	Font O;
	Font V;
	Font E2;
	Font R;
	Font pressBackspace;
	RocketShip ship;
	ObjectManager manager;
	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Hoefler", Font.BOLD, 48);
		pressEnter = new Font("Comic Sans", Font.PLAIN, 24);
		pressSpace = new Font("Comic Sand", Font.PLAIN, 24);
		G = new Font("Hoefler", Font.BOLD, 100);
		A = new Font("Hoefler", Font.BOLD, 95);
		M = new Font("Hoefler", Font.BOLD, 105);
		E = new Font("Hoefler", Font.BOLD, 110);
		O = new Font("Hoefler", Font.BOLD, 90);
		V = new Font("Hoefler", Font.BOLD, 105);
		E2 = new Font("Hoefler", Font.BOLD, 110);
		R = new Font("Hoefler", Font.BOLD, 105);
		pressBackspace = new Font("Comic Sans", Font.PLAIN, 24);
		ship = new RocketShip(250, 700, 50, 50, 0);
		manager = new ObjectManager();
		manager.addObject(ship);
	}

	void startGame() {
		timer.start();
	}

	void updateMenuState() {
		
	}

	void updateGameState() {
		manager.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 20, 200);
		g.setFont(pressEnter);
		g.drawString("Press ENTER to begin", 120, 500);
		g.setFont(pressSpace);
		g.drawString("Press SPACE for instructions", 80, 550);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
		manager.draw(g);
	}

	void drawEndState(Graphics g) {
		int randomX = new Random().nextInt(10);
		randomX -= 5;
		int randomY = new Random().nextInt(10);
		randomY -= 5;
		int randomX1 = new Random().nextInt(10);
		randomX -= 5;
		int randomY1 = new Random().nextInt(10);
		randomY -= 5;
		int randomX2 = new Random().nextInt(10);
		randomX -= 5;
		int randomY2 = new Random().nextInt(10);
		randomY -= 5;
		int randomX3 = new Random().nextInt(10);
		randomX -= 5;
		int randomY3 = new Random().nextInt(10);
		randomY -= 5;
		int randomX4 = new Random().nextInt(10);
		randomX -= 5;
		int randomY4 = new Random().nextInt(10);
		randomY -= 5;
		int randomX5 = new Random().nextInt(10);
		randomX -= 5;
		int randomY5 = new Random().nextInt(10);
		randomY -= 5;
		int randomX6 = new Random().nextInt(10);
		randomX -= 5;
		int randomY6 = new Random().nextInt(10);
		randomY -= 5;
		int randomX7 = new Random().nextInt(10);
		randomX -= 5;
		int randomY7 = new Random().nextInt(10);
		randomY -= 5;
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.WHITE);
		g.setFont(G);
		g.drawString("G", 115 + randomX, 190 + randomY);
		g.setFont(A);
		g.drawString("A", 180 + randomX1, 155 + randomY1);
		g.setFont(M);
		g.drawString("M", 260 + randomX2, 145 + randomY2);
		g.setFont(E);
		g.drawString("E", 375 + randomX3, 155 + randomY3);
		g.setFont(O);
		g.drawString("O", 75 + randomX4, 255 + randomY4);
		g.setFont(V);
		g.drawString("V", 180 + randomX5, 255 + randomY5);
		g.setFont(E2);
		g.drawString("E", 285 + randomX6, 250 + randomY6);
		g.setFont(R);
		g.drawString("R", 365 + randomX7, 260 + randomY7);
		g.setFont(pressBackspace);
		int randomX8 = new Random().nextInt(4);
		randomX8 -= 2;
		int randomY8 = new Random().nextInt(4);
		randomY8 -= 2;
		g.drawString("Press BACKSPACE to try again", 80 + randomX8, 500 + randomY8);
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState > GAME_STATE) {
				currentState = MENU_STATE;
			} else {
				currentState++;
			}
		} if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.speed = 5;;
		} if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.speed = -5;
		} if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(ship.x + 20, ship.y + 20, 10, 10, 10));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
