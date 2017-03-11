package level1;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	
	JButton button1 = new JButton ();
	JButton button2 = new JButton ();
	JButton button3 = new JButton ();
	JButton button4 = new JButton ();
	JButton button5 = new JButton ();
	JButton button6 = new JButton ();
	JButton button7 = new JButton ();
	JButton button8 = new JButton ();
	JButton button9 = new JButton ();
	public void createUI () {
		frame.add(panel);
		frame.setSize(300, 300);
		panel.setLayout(new GridLayout(3, 3));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		frame.setVisible(true);
		frame.pack();
	}
	public void drawButtons () {
		int rand = new Random().nextInt(9);
		if (rand==0) {
			button1.setText("boop");
		} if (rand==1) {
			button2.setText("beep");
		} if (rand==2) {
			button3.setText("bang");
		} if (rand==3) {
			button4.setText("bleh");
		} if (rand==4) {
			button5.setText("burp");
		} if (rand==5) {
			button6.setText("boo");
		} if (rand==6) {
			button7.setText("bap");
		} if (rand==7) {
			button8.setText("belch");
		} if (rand==8) {
			button9.setText("feminism");
		} 
	}
public static void main(String[] args) {
	WhackAMole game = new WhackAMole();
	game.createUI();
	game.drawButtons();
}
}
