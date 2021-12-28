package lesson_07.windowParts.infoParts;

import javax.swing.*;
import java.awt.*;

public class PlayerControls  extends JPanel {
    private JButton btnLeft;
    private JButton btnUp;
    private JButton btnRight;
    private JButton btnDown;

    public PlayerControls(){
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setLayout(new GridLayout(2, 3));

        btnUp = new JButton("\uD83E\uDC15");
        btnRight = new JButton("\uD83E\uDC16");
        btnDown = new JButton("\uD83E\uDC17");
        btnLeft = new JButton("\uD83E\uDC14");

        add(new JPanel());
        add(btnUp);
        add(new JPanel());
        add(btnRight);
        add(btnDown);
        add(btnLeft);


    }
}
