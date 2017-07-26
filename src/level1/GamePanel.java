package level1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JOptionPane;
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
	Font scoreText;
	Font scoreNumber;
	Font number0;
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
		scoreText = new Font("Hoefler", Font.BOLD, 48);
		scoreNumber = new Font("Hoefler", Font.BOLD, 75);
		number0 = new Font("Hoefler", Font.BOLD, 75);
		ship = new RocketShip(250, 700, 50, 50, 0, 0);
		manager = new ObjectManager();
		manager.addObject(ship);
	}

	void startGame() {
		timer.start();
	}

	void updateMenuState() {
		manager.setScore(0);
	}

	void updateGameState() {
		manager.update();
		manager.manageEnemies();
		manager.managePowerUps();
		manager.checkCollision();
		if (ship.isAlive==false) {
			currentState = END_STATE;
			manager.reset();
			ship = new RocketShip(250, 700, 50, 50, 0, 0);
			manager.addObject(ship);
		}
	}

	void updateEndState() {
		manager.enemySpawnTime=250;
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
		Random rand = new Random();
		int randomX = rand.nextInt(10);
		randomX -= 5;
		int randomY = rand.nextInt(10);
		randomY -= 5;
		int randomX1 = rand.nextInt(10);
		randomX -= 5;
		int randomY1 = rand.nextInt(10);
		randomY -= 5;
		int randomX2 = rand.nextInt(10);
		randomX -= 5;
		int randomY2 = rand.nextInt(10);
		randomY -= 5;
		int randomX3 = rand.nextInt(10);
		randomX -= 5;
		int randomY3 = rand.nextInt(10);
		randomY -= 5;
		int randomX4 = rand.nextInt(10);
		randomX -= 5;
		int randomY4 = rand.nextInt(10);
		randomY -= 5;
		int randomX5 = rand.nextInt(10);
		randomX -= 5;
		int randomY5 = rand.nextInt(10);
		randomY -= 5;
		int randomX6 = rand.nextInt(10);
		randomX -= 5;
		int randomY6 = rand.nextInt(10);
		randomY -= 5;
		int randomX7 = rand.nextInt(10);
		randomX -= 5;
		int randomY7 = rand.nextInt(10);
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
		g.setFont(scoreText);
		int randomX8 = new Random().nextInt(6);
		randomX8 -= 3;
		int randomY8 = new Random().nextInt(6);
		randomY8 -= 3;
		g.drawString("SCORE:", 75 + randomX8, 400 + randomY8);
		g.setFont(pressEnter);
		int randomX9 = new Random().nextInt(4);
		randomX8 -= 2;
		int randomY9 = new Random().nextInt(4);
		randomY8 -= 2;
		g.drawString("Press ENTER to try again", 105 + randomX9, 500 + randomY9);
		g.setFont(scoreNumber);
		int randomX10 = new Random().nextInt(8);
		randomX8 -= 4;
		int randomY10 = new Random().nextInt(8);
		randomY8 -= 4;
		int randomX11 = new Random().nextInt(8);
		randomX8 -= 4;
		int randomY11 = new Random().nextInt(8);
		randomY8 -= 4;
		int score = manager.getScore();
		score/=10;
		g.drawString(""+score, 275 + randomX10, 400 + randomY10);
		g.setFont(number0);
		g.drawString("0", 375 + randomX11, 400 + randomY11);
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
			ship.speed = 6;
		} if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.speed = -6;
		} if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(ship.x + 20, ship.y + 20, 10, 10, 10 + ship.projectileSpeed));
		} if (e.getKeyCode() == KeyEvent.VK_TAB) {
			JOptionPane.showMessageDialog(null, "Space: Shoot | Arrow Keys: Move");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
