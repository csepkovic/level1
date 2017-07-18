package level1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
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
		button1.addActionListener((ActionListener) this);
		panel.add(button2);
		button2.addActionListener((ActionListener) this);
		panel.add(button3);
		button3.addActionListener((ActionListener) this);
		panel.add(button4);
		button4.addActionListener((ActionListener) this);
		panel.add(button5);
		button5.addActionListener((ActionListener) this);
		panel.add(button6);
		button6.addActionListener((ActionListener) this);
		panel.add(button7);
		button7.addActionListener((ActionListener) this);
		panel.add(button8);
		button8.addActionListener((ActionListener) this);
		panel.add(button9);
		button9.addActionListener((ActionListener) this);
		frame.setVisible(true);
		frame.pack();
	}
	public void drawButtons (int rand) {
		if (rand==0) {
			button1.setText("bang");
		} if (rand==1) {
			button2.setText("bang");
		} if (rand==2) {
			button3.setText("bang");
		} if (rand==3) {
			button4.setText("bang");
		} if (rand==4) {
			button5.setText("bang");
		} if (rand==5) {
			button6.setText("bang");
		} if (rand==6) {
			button7.setText("bang");
		} if (rand==7) {
			button8.setText("bang");
		} if (rand==8) {
			button9.setText("bang");
		} 
	}
public static void main(String[] args) {
	WhackAMole game = new WhackAMole();
	game.createUI();
	int random = new Random().nextInt(9);
	game.drawButtons(random);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b = (JButton)e.getSource();
	String text = b.getText();
	System.out.println(text);
	if (text.equals("bang")) {
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
		int rand = new Random().nextInt(9);
		drawButtons(rand);
	} else {
		int random = new Random().nextInt(3);
		if (random==1){
			JOptionPane.showMessageDialog(null, "You suck haaa");
		} else if (random==2){
			JOptionPane.showMessageDialog(null, "You're bad at this");
		} else if (random==3){
			JOptionPane.showMessageDialog(null, "Dude the answer is obvious");
		}
	}
}

}
