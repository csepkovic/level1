package level1;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel panel;
	static int width = 500;
	int height = 800;
	public LeagueInvaders(int width, int height) {
		this.width = width;
		this.height = height;
		frame = new JFrame();
		panel = new GamePanel();
		setup();
	}



	void setup() {
		frame.add(panel);
		frame.addKeyListener(panel);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.startGame();
	}

	public static void main(String[] args) {
		LeagueInvaders game = new LeagueInvaders(500, 800);
	}
}
