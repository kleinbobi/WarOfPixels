import javax.swing.*;
import java.awt.*;

public class PanlesShowforConsol extends JFrame {

    public PanlesShowforConsol(JPanel panel) throws HeadlessException {


        setTitle("");
        setBounds(25, 25, main.w, main.h);

        setResizable(false);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        contentPane.add(panel);


        panel.setBounds(0, 0, main.w, main.h);


        setVisible(true);
    }
}
