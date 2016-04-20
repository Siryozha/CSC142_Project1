import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class


/**
 * <p>Create a cable car in a graphics window</p>  
 * @author your name here
 */

public class CableCar {

	// Your instance fields go here
	private int x, y;
	private double scale;
	GWindow window;

	/**
	* Create a cable car at location (x,y) in the GWindow window.
	* @param x the x coordinate of the center of the cable car
	* @param y the y coordinate of the center of the cable car
	* @scale the factor that multiplies all default dimensions for this cable car
	* (e.g. if the default size is 80, the size of this cable car is
	* scale * 80)
	* @window the graphics window this cable car belongs to
	*/
	public CableCar(int x, int y, double scale, GWindow window) {
		// initialize the instance fields
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.window = window;
		// The details of the drawing are in a private method
		this.Draw();
	}

	/** Draw a cable car at location (x,y) 
	 *  default size will be 100px*60px */
	private void Draw() {
		int width = (int)(100 * scale);
		int height = (int)(60 * scale);
		int startX = x-(width/2);
		int startY = y-(height/2);
		Rectangle body = new Rectangle(startX, startY, width, height, Color.gray, true);
		window.add(body);
	}
}