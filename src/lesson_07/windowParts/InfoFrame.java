package lesson_07.windowParts;

import lesson_07.windowParts.infoParts.LevelInfo;
import lesson_07.windowParts.infoParts.MainMenu;
import lesson_07.windowParts.infoParts.PlayerControls;
import lesson_07.windowParts.infoParts.PlayerInfo;

import javax.swing.*;
import java.awt.*;

public class InfoFrame extends JPanel {

    private MainMenu mainMenu;
    private LevelInfo levelInfo;
    private PlayerInfo playerInfo;
    private PlayerControls playerControls;
    private JTextArea log;
    private JScrollPane scrollPane;

    public InfoFrame(){
        frameSetup();
        add(mainMenu);
        add(levelInfo);
        add(playerInfo);
        add(playerControls);
        add(scrollPane);
    }

    private void frameSetup(){
        setBackground(Color.BLUE);
        setLayout(new GridLayout(5, 1));

        mainMenu = new MainMenu();
        levelInfo = new LevelInfo();
        playerInfo = new PlayerInfo();
        playerControls = new PlayerControls();

        log = new JTextArea();
        scrollPane = new JScrollPane(log);


    }
}
