package com.hams;

import com.hams.snowman.Snowman;
import uwcse.graphics.GWindow;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GWindow window = new GWindow(600,800);
        new Snowman(100,100,.5,window);
    }
}
