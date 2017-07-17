package level1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
public void createUI () {
	frame.add(panel);
	frame.setSize(width, height);
	panel.setLayout(new GridLayout(3, 1));
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.setVisible(true);
	frame.pack();
}

}
