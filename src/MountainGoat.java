import java.awt.Color;

import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

public class MountainGoat {
	
	private int x;
	private int y;
	private double scale;
	private GWindow window;
	
	public MountainGoat(int x, int y, double scale, GWindow window) {
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.window = window;
		this.drawGoat();
	}

	private void drawGoat() {
		int size = (int) (50 * this.scale);
		Rectangle body = new Rectangle(this.x, 
				this.y, 
				2 * size, 
				size, 
				Color.white,
				true);
		this.window.add(body);
	}
}
