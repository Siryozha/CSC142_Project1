import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>Create a snow man in a graphics window</p>
 * @author your name here
 */  

public class SnowMan {

  // Your instance fields go here

  /**
   * Create a snow man in at location (x,y) in the GWindow window.
   * @param x the x coordinate of the center of the head of the snow man
   * @param y the y coordinate of the center of the head of the snow man
   * @scale the factor that multiplies all default dimensions for this snow man
   * (e.g. if the default head radius is 20, the head radius of this snow man is
   * scale * 20)
   * @window the graphics window this snow man belongs to
   */
  public SnowMan(int x, int y, double scale, GWindow window)
  {
    // initialize the instance fields

    // Put the details of the drawing in a private method
    this.Draw();
  }

  /** Draw in the graphics window a snow man at location (x,y) */
  private void Draw()
  {
  }
}