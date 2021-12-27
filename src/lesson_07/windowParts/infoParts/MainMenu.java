package lesson_07.windowParts.infoParts;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

    private JButton btnGameStart;
    private JButton btnGameExit;

    public MainMenu(){
        setLayout(new GridLayout(3, 1));

        btnGameStart = new JButton("Start game");
        btnGameExit = new JButton("Exit game");

        add(new JLabel("-= Main menu =-", SwingConstants.CENTER));
        add(btnGameStart);
        add(btnGameExit);
    }
}
