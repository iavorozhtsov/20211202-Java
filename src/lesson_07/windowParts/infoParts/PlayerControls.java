package lesson_07.windowParts.infoParts;

import javax.swing.*;
import java.awt.*;

public class PlayerControls  extends JPanel {
    private JButton btnLeft;
    private JButton btnUp;
    private JButton btnRight;
    private JButton btnDown;

    public PlayerControls(){
        setLayout(new GridLayout(2, 3));

        btnUp = new JButton("Up");
        btnRight = new JButton("Right");
        btnDown = new JButton("Down");
        btnLeft = new JButton("Left");

        add(new JPanel());
        add(btnUp);
        add(new JPanel());
        add(btnRight);
        add(btnDown);
        add(btnLeft);


    }
}
