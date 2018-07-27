package com.sdacademy.day3.guitutorial;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        showWindow();
    }

    private static void showWindow(){
        //1. Create the frame.
        JFrame frame = new JFrame("FrameDemo");

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
        frame.getContentPane().add(new Label("Hello GUI"), BorderLayout.CENTER);

        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);
        frame.setSize(200, 200);
    }

}


