import javax.swing.*;
import java.awt.*;

public class EggTimer {
  public static void main(String[] args) {
    JFrame win = new JFrame("Egg Timer");
    Container cont = win.getContentPane();
    cont.setBackground(Color.yellow);

    BorderLayout bL = new BorderLayout();
    bL.setVgap(5);
    cont.setLayout(bL);

    JTextArea tA = new JTextArea(10, 30);
    cont.add(tA, BorderLayout.CENTER);

    JLabel sLabel = new JLabel("Have a nice day!");
    sLabel.setHorizontalAlignment(JLabel.CENTER);
    sLabel.setOpaque(true);
    sLabel.setBackground(Color.green);
    cont.add(sLabel, BorderLayout.SOUTH);

    win.pack();
    win.setVisible(true);

    tA.append("Start boiling the eggs\n");
    Timer.pause(6);
    tA.append("The eggs are ready to eat\n");
  }
}
