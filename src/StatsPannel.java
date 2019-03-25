import javax.swing.*;
import java.awt.*;

public class StatsPannel extends JFrame {
    private statistics stats;

    private static Color[] colors = {Color.white,Color.RED,Color.yellow,Color.MAGENTA,Color.BLACK,Color.ORANGE};
    private int position[] = {0,1,2,3,4,5};

    JLabel labela[] = new JLabel[6];

    JLabel labels[] = new JLabel[6];

    JSlider slider = new JSlider();

    JButton buttons[] = new JButton[6];

    JButton buttons2[] = new JButton[6];

    public StatsPannel() throws HeadlessException {


        setTitle("");
        setBounds(main.w+50, main.h, 300, main.h);

        setResizable(true);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        for (int i = 0; i < labela.length; i++) {
            labela[i] = new JLabel();
            contentPane.add(labela[i]);
        }

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel();
            contentPane.add(labels[i]);
        }

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            contentPane.add(buttons[i]);
        }

        for (int i = 0; i < buttons2.length; i++) {
            buttons2[i] = new JButton();
            contentPane.add(buttons2[i]);
        }

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBackground(colors[i]);
        }

        slider.setMinimum(0);
        slider.setMaximum(500);
        slider.setValue(100);

        contentPane.add(slider);
        slider.setBounds(0,main.h-200,300,50);
        setVisible(true);
    }
    public void setStats(statistics stats) {
        this.stats = stats;
    }

    public int getSlider(){
       return slider.getValue();
    }
    public void showStats(){



        for (int i = 0; i < labela.length; i++) {
            labela[i].setText("["+i+"] Personen:"+stats.getPersonenAnzahl(i));
        }


        for (int i = 0; i < labels.length; i++) {
            labels[i].setText("Stärke:"+stats.getDStärke(i));
        }

        for (int i = 0; i < labela.length; i++) {
            labela[i].setBounds(50,50*i,150,50);
        }

        for (int i = 0; i < labels.length; i++) {
            labels[i].setBounds(200,50*i,150,50);
        }

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(15,50*i+15,20,20);
        }


        for (int i = 0; i < buttons2.length; i++) {
            buttons2[i].setBackground(colors[position[i]]);
      ///      System.out.println("off:"+position[i]);
        }
       // System.out.println("------");
        for (int i = 0; i < buttons2.length; i++) {
            buttons2[i].setBounds(20,50*i+300,260,30);
        }


    }

    public void sortiare(){
        int arry[] = new int[6];

        for (int i = 0; i < arry.length; i++) {
            arry[i]=stats.getPersonenAnzahl(i);
        }

            for (int j = 0; j < arry.length; j++) {
                for (int i = 0; i < labela.length - 1; i++) {
                    if (arry[i] < arry[i + 1]) {
                        int save = position[i];
                        position[i] = position[i + 1];
                        position[i + 1] = save;
                        save = arry[i];
                        arry[i] = arry[i + 1];
                        arry[i + 1] = save;

                    }

            }
        }

    }

}
