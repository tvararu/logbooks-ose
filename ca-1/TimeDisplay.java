import javax.swing.*;
import java.awt.*;

public class TimeDisplay {
  public static void main(String[] args) {
    JFrame win = new JFrame("Time Display");
    Container cont = win.getContentPane();
    cont.setBackground(Color.orange);

    BorderLayout bL = new BorderLayout();
    bL.setHgap(5);
    bL.setVgap(5);
    cont.setLayout(bL);

    JTextArea tA = new JTextArea(10, 30);
    JScrollPane sP = new JScrollPane(tA);
    sP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    cont.add(sP, BorderLayout.CENTER);

    JLabel nLabel = new JLabel("Time is updated every 3 seconds");
    nLabel.setHorizontalAlignment(JLabel.CENTER);
    nLabel.setOpaque(true);
    nLabel.setBackground(Color.green);
    cont.add(nLabel, BorderLayout.NORTH);

    JLabel sLabel = new JLabel("Use the scrollbar to go to the latest entry");
    sLabel.setHorizontalAlignment(JLabel.CENTER);
    sLabel.setOpaque(true);
    sLabel.setBackground(Color.green);
    cont.add(sLabel, BorderLayout.SOUTH);

    win.pack();
    win.setVisible(true);
    while (true) {
      TimeData t = new TimeData(System.currentTimeMillis());

      tA.append("The current system time is: " + t.toTimeString() + "\n");

      Timer.pause(3);
    }
  }
}
