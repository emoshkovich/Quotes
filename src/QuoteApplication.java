import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

public class QuoteApplication {
	/**
	 * Main is run when the program starts executing.
	 * 
	 * @param args
	 *            None expected.
	 * 
	 */
	public static void main(String[] args) {

		// Create a JFrame.
		JFrame frame = new JFrame();

		// Exit the application when the user closes the frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the panel to the center of the window.
		Container contentPane = frame.getContentPane();

		// Create an instance of QuoteView and add it to the contentPane.
		QuoteView quote = new QuoteView();
		contentPane.add(quote.mainPanel());

		// Set the title of the window.
		frame.setTitle("MotiQuotes");

		// Set the size of the window so that everything fits.
		frame.setSize(new Dimension(900, 500));

		// Display the window.
		frame.setVisible(true);
	}
}
