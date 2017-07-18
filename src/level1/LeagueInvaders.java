package level1;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
public LeagueInvaders(){
	frame = new JFrame();
	setup();
}
int width = 500;
int height = 800;
void setup(){
	frame.setVisible(true);
	frame.setSize(width, height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	LeagueInvaders game = new LeagueInvaders();
}
}
