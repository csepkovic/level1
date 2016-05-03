package level1;

// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String bolbi = "https://i.ytimg.com/vi/OfB3LfJ4jHE/hqdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image=createImage(bolbi);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q1 = JOptionPane.showInputDialog(null, "What is this man's name?");
		// 7. print "CORRECT" if the user gave the right answer
		if (q1.equalsIgnoreCase("bolbi")) {
			JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!");
			score++;
			System.out.println(score);
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "YOU ARE CORRECT IN ANOTHER DIMENSION EXCEPT THIS ONE!!!");
			System.out.println(score);
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String carl = "http://i.imgur.com/COfpXhK.png";
		Component image2 = createImage(carl);
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String q2 = JOptionPane.showInputDialog("What is this man's name?");
		if (q2.equalsIgnoreCase("carl")) {
			JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!");
			score++;
			System.out.println(score);
		} else {
			JOptionPane.showMessageDialog(null, "YOU ARE CORRECT IN ANOTHER DIMENSION EXCEPT THIS ONE!!!");
			System.out.println(score);
		}
		// 14+ check answer, say if correct or incorrect, etc.
		JOptionPane.showMessageDialog(null, "Your final score was....." + score + "!!");
		
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





