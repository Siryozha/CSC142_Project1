import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class
import snowman.Snowman;

/**
 * <p>
 * A MountainScene displays snow men, trees (with ornaments), a cable car and a
 * fourth element of your choice in a graphics window
 * </p>
 * 
 * @author Your name here
 */

public class MountainScene {

	/** The graphics window that displays the picture */
	private GWindow window;

	/**
	 * Create an image of a mountain scene
	 */
	public MountainScene() {

		// The graphics window
		// The window is by default 500 wide and 400 high
		window = new GWindow("Mountain scene",600,400);
		window.setExitOnClose(); // so that a click on the close box of the
		// window terminates the application

		// Background (cyan here)
		Rectangle bgnd = new Rectangle(
                0, 0,
                window.getWindowWidth(),
                window.getWindowHeight(),
                Color.cyan,
                true);

		window.add(bgnd);

		// Create the scene elements
		// e.g. a tree in the lower left area 1.5 times the normal size
		new Tree(100, 300, 1.5, window);
		new Snowman(160,300,.5,window);

	}

	/**
	 * Entry point of the program
	 */
	public static void main(String[] args) {new MountainScene();}

}