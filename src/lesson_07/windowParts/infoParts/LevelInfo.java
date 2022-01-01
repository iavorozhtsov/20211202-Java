package lesson_07.windowParts.infoParts;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LevelInfo extends JPanel {
    private final String PREF_MAP = "Map size: ";
    private final String PREF_LVL = "Map level: ";
    private final String PREF_TRP = "Traps count: ";

    private String mapSize;
    private int mapLevel;
    private int trapsCount;

    private JLabel lblMapSize;
    private JLabel lblMapLevel;
    private JLabel lblTrapsCount;

    public LevelInfo(){
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setLayout(new GridLayout(4, 1));
        lblMapSize = new JLabel(PREF_MAP);
        lblMapLevel = new JLabel(PREF_LVL);
        lblTrapsCount = new JLabel(PREF_TRP);

        add(new JLabel("-= Level info =-", SwingConstants.CENTER));
        add(lblMapSize);
        add(lblMapLevel);
        add(lblTrapsCount);
    }
}
