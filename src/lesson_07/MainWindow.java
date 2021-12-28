package lesson_07;

import lesson_07.windowParts.InfoFrame;
import lesson_07.windowParts.MapFrame;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    int wHeight = 768;
    int wWidth = 1024;
    int wStartX = 300;
    int wStartY = 50;

    MainWindow(){
        windowSetup();

        InfoFrame info = new InfoFrame();
        MapFrame map = new MapFrame();


        add(map);
        add(info, BorderLayout.EAST);


        setVisible(true);
    }

    private void windowSetup() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(wWidth, wHeight);
        setLocation(wStartX, wStartY);
        setTitle("My First GUI Game");
        setResizable(false);
    }
}
