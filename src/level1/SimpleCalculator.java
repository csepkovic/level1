package level1;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements MouseListener {
		JFrame calculator = new JFrame ();
		JPanel panel = new JPanel ();
		JButton add = new JButton();
		JButton multi = new JButton();
		JButton sub = new JButton();
		JButton div = new JButton();
		JTextField number1 = new JTextField();
		JTextField number2 = new JTextField();
		JLabel product = new JLabel();
		
	public void createUI() {
		calculator.add(panel);
		number1.setSize(100, 100);
		number2.setSize(100, 100);
		panel.add(number1);
		panel.add(number2);
		panel.add(add);
		panel.add(multi);
		panel.add(sub);
		panel.add(div);
		panel.add(product);
		add.setText("Add");
		multi.setText("Multiply");
		sub.setText("Subtract");
		div.setText("Divide");
		calculator.pack();
		add.addMouseListener(this);
		multi.addMouseListener(this);
		sub.addMouseListener(this);
		div.addMouseListener(this);
		calculator.setVisible(true);
	}
	
	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		calc.createUI();
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(number1.getText());
		int num2 = Integer.parseInt(number2.getText());
		String finish;
		if (e.getSource()==add) {
			finish = Integer.toString(num1 + num2);
			product.setText(finish);
		} else if (e.getSource()==multi) {
			finish = Integer.toString(num1 * num2);
			product.setText(finish);
		} else if (e.getSource()==sub) {
			finish = Integer.toString(num1 - num2);
			product.setText(finish);
		} else if (e.getSource()==div) {
			finish = Integer.toString(num1 / num2);
			product.setText(finish);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
