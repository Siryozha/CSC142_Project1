package snowman;

import java.awt.*;

/**
 * Created by Aaron Hand on 4/18/16.
 * Project: Project1
 *
 *
 * This class is just to make drawing a little more manageable by
 * dividing up the canvas into a grid.
 *
 * getX and getY will return the pixel values of cell intersection
 * e.g.
 * grid.getX(1,2) = 23
 * grid.getY(1,2) = 46
 *
 * spanX and spanY will return the calculated cell sizes in order to adjust points
 * e.g.
 * grid.getX(1,2) - spanX(2)
 *
 */

public class Grid {

    private int width,height,xPt,yPt;
    private Point[][] points;

    /**
     *
     * @param xPt location of Object
     * @param yPt location of Object
     * @param width width of Object
     */

    public Grid(int xPt, int yPt, int width) {
        this.width = width;
        this.height = width * 2;
        this.xPt = xPt;
        this.yPt = yPt;
        setPoints();
    }

    private void setPoints(){

        points = new Point[11][21];                 //grid size 11x21 allows for center

        for (int i = 0; i <= 10 ; i++) {            //populate grid with scaled cells
            for (int j = 0; j <= 20 ; j++) {
                points[i][j] = new Point(
                        i * (width / 10) + xPt,
                        j * (height / 20) + yPt
                );
            }
        }
    }

    /**
     *
     * @param x location
     * @param y location
     * @return int
     */

    public int getX(int x, int y) {return (int)points[x][y].getX();}
    public int getY(int x, int y) {return (int)points[x][y].getY();}

    /**
     * Return single cell width or height
     * Used for padding
     */

    public int spanX(int x){return x * (width / 10);}
    public int spanY(int y){return y * (height / 20);}

}
