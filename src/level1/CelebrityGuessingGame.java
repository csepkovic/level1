package level1;


	import java.awt.Frame;
	import java.util.ArrayList;
	import java.util.Iterator;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class CelebrityGuessingGame {

		// Get 3 celebrity photos from the internet, save them to your computer, and fill
		// in their paths here. To get the path, right click on the image, and copy its Location.
		String firstImage = "/Users/league/Desktop/theProphecyChild.jpg";
		String secondImage = "/Users/league/Desktop/croissant.png";
		String thirdImage = "/Users/league/Desktop/Ji-jim-ji-jimm-jimmy.jpg";

		Frame window = new Frame();
		
		private void startQuiz() {
			// Set the size of the window so that you can only see part of the image.
				window.setSize(150, 150);
			// Make an int variable to hold the score.
				int score = 0;
			// Ask the user who this person is and store their answer
				String q1 = JOptionPane.showInputDialog("Who is this man?");
			// If they got the answer right:
			// -- Tell them they are correct.
			// -- Increase the score by 1
				window.setSize(640, 480);
				if (q1.equalsIgnoreCase("bolbi")) {
					JOptionPane.showMessageDialog(null, "Correctamundo!");
					score++;
				}
			// Otherwise:
			// -- Tell them they are wrong
				else {
					JOptionPane.showMessageDialog(null, "Frickin scrub...");
				}
				JOptionPane.showMessageDialog(null, "Your score is " + score);
			// Use the method below to show the next image
				showNextImage();
				window.setSize(150, 150);
				String q2 = JOptionPane.showInputDialog("Who is this man?");
				window.setSize(640, 480);
				if (q2.equalsIgnoreCase("carl")) {
					JOptionPane.showMessageDialog(null, "Yeet *dabs");
					score++;
				} else {
					JOptionPane.showMessageDialog(null, "Ya dingus");
				} JOptionPane.showMessageDialog(null, "Your score is " + score);
				showNextImage();
				window.setSize(150, 150);
				String q3 = JOptionPane.showInputDialog("Who is this man?");
				window.setSize(600, 337);
				if (q3.equalsIgnoreCase("jimmy")) {
					JOptionPane.showMessageDialog(null, "Yaperdoooo");
					score++;
				} else {
					JOptionPane.showMessageDialog(null, "Dude....bruh");
				} JOptionPane.showMessageDialog(null, "Your final score is " + score);
				if (score < 1) {
					JOptionPane.showMessageDialog(null, "Nice job ya' frickin' idiot");
				} else if (score > 2) {
					JOptionPane.showMessageDialog(null, "Atta' kid");
				}
			// Show the score
			// .... repeat for all your images.....
		}

		public void showNextImage() {
			window.removeAll();
			window.add(getNextImage());
			window.pack();
		}

		public static void main(String[] args) {
			CelebrityGuessingGame quiz = new CelebrityGuessingGame();
			quiz.initializeGui();
			quiz.startQuiz();
		}

		private void initializeGui() {
			initializeImageList();
			imageIterator = imageList.iterator();
			window.setVisible(true);
			showNextImage();
		}

		private JLabel loadImage(String fileName) {
			Icon icon = new ImageIcon(fileName);
			JLabel image = new JLabel(icon);
			return image;
		}

		ArrayList<JLabel> imageList = new ArrayList<JLabel>();
		Iterator<JLabel> imageIterator;

		private void initializeImageList() {
			JLabel imageLabel = loadImage(firstImage);
			imageList.add(imageLabel);
			imageLabel = loadImage(secondImage);
			imageList.add(imageLabel);
			imageLabel = loadImage(thirdImage);
			imageList.add(imageLabel);
		}

		private JLabel getNextImage() {
			if (imageIterator.hasNext())
				return imageIterator.next();
			window.dispose();
			return new JLabel();
		}
	}



