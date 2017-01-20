package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
	}
	void showButton () {
		JFrame jFrame = new JFrame ();
		jFrame.setVisible(true);
		JButton butt = new JButton();
		jFrame.add(butt);
		butt.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Vague and nonspecific fortune");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Dumb and unwanted fortune");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Unlucky fortune");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Decent fortune");
		}
		else {
			JOptionPane.showMessageDialog(null, "1 million dollars is coming your way");
		}
	}
}
