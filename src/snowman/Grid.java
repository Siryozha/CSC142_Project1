package snowman;

import java.awt.*;

/**
 * Created by Aaron Hand on 4/18/16.
 * Project: Project1
 */
public class Grid {
    private int width,height,xPt,yPt;
    private Point[][] points;

    public Grid(int xPt, int yPt, int width) {
        this.width = width;
        this.height = width * 2;
        this.xPt = xPt;
        this.yPt = yPt;
        setPoints();
    }

    private void setPoints(){

        points = new Point[11][21];
        for (int i = 0; i <= 10 ; i++) {
            for (int j = 0; j <= 20 ; j++) {
                System.out.println(i + " - " + j);
                points[i][j] = new Point(
                        i * (width / 10) + xPt,
                        j * (height / 20) + yPt
                );
                System.out.println(points[i][j]);
            }

        }



    }

    public int getX(int x, int y) {
        return (int)points[x][y].getX();
    }
    public int getY(int x, int y) {
        return (int)points[x][y].getY();
    }

    public int spanX(int x){
        return x * (width / 10);
    }
    public int spanY(int y){
        return y * (height / 20);
    }

}
