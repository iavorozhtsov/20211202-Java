package lesson_07.windowParts.infoParts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfo  extends JPanel {
    private final String PREF_HP = "Health: ";
    private final String PREF_STR = "Strength: ";
    private final String PREF_EXP = "Experience: ";

    private String hp;
    private int lvl;
    private int exp;

    private JLabel lblHP;
    private JLabel lblSTR;
    private JLabel lblExp;

    public PlayerInfo(){
        setLayout(new GridLayout(4, 1));
        lblHP = new JLabel(PREF_HP);
        lblSTR = new JLabel(PREF_STR);
        lblExp = new JLabel(PREF_EXP);

        add(new JLabel("-= Player info =-", SwingConstants.CENTER));
        add(lblHP);
        add(lblSTR);
        add(lblExp);
    }
}
