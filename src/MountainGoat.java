import java.awt.Color;

import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;
import uwcse.graphics.Triangle;

/**
 * @author huiyingcao
 *
 * A MountainGoat that can be added to a GWindow.
 */
public class MountainGoat {
	
	private int x;
	private int y;
	private double scale;
	private GWindow window;
	
	/**
	 * @param x 
	 *     top left x coordinate of the body
	 * @param y 
	 *     top left y coordinate of the body
	 * @param scale 
	 *     scale factor for the x and y coordinates
	 * @param window 
	 *     window for the graphic 
	 */
	public MountainGoat(int x, int y, double scale, GWindow window) {
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.window = window;
		this.drawGoat();
	}

	/**
	 * Draw the goat.
	 */
	private void drawGoat() {
		int size = (int) (50 * this.scale);
		Rectangle body = new Rectangle(this.x, 
										this.y, 
										2 * size, 
										size, 
										Color.white,
										true);
		
		// Add the body to the window
		this.window.add(body);
		
		// Make the head
		this.drawHead(this.x, this.y - 10);
		
		// Make the legs
		this.drawLeg(this.x, this.y + size);
		this.drawLeg(this.x + 2*size - (int) (10 * this.scale), this.y + size);
		
		// Make the tail
		this.drawTail(this.x + 2*size, this.y);
	}
	
	/**
	 * 
	 * Draw a head at the given position
	 * 
	 * @param x 
	 *     The x coordinate of the top right corner
	 * @param y
	 *     The y coordinate of the top right corner
	 */
	private void drawHead(int x, int y) {
		int size = (int) (22 * this.scale);
		Rectangle head = new Rectangle(x - 2*size, y, 2 * size, size, Color.white, true);
		this.window.add(head);
		
		//Make the horns
		this.drawHorns(x, y);
	}
	
	/**
	 * 
	 * Draw a horn at the given position
	 * 
	 * @param x
	 * 	   The x coordinate of the bottom right corner
	 * @param y 
	 *     The y coordinate of the bottom right corner
	 */
	private void drawHorns(int x, int y) {
		int size = (int) (10 * this.scale);
		Triangle horns = new Triangle(x, y,  x - size, y, x, y - 3*size, Color.black, true);
		this.window.add(horns);
	}
	
	/**
	 * 
	 * Draw a leg at the given position
	 * 
	 * @param x
	 *     The x coordinate of the top left corner
	 * @param y
	 *     The y coordinate of the top left corner
	 */
	private void drawLeg(int x, int y) {
		int size = (int) (10 * this.scale);
		Rectangle leg = new Rectangle(x, y, size, 3*size, Color.white, true);
		this.window.add(leg);
	}
	
	/**
	 * 
	 * Draw a tail at the given position
	 * 
	 * @param x
	 *     The x coordinate of the top left corner
	 * @param y
	 *     The y coordinate of the top left corner
	 */
	private void drawTail(int x, int y) {
		int size = (int) (10 * this.scale);
		Rectangle tail = new Rectangle(x, y, 2*size, size, Color.white, true);
		this.window.add(tail);
	}
}
