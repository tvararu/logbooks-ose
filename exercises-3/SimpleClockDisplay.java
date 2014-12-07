import javax.swing.*;

public class SimpleClockDisplay {
  public static void main(String[] args) {
    JFrame view = new JFrame("Simple Clock Display");

    JTextArea tA = new JTextArea(10, 30);

    view.getContentPane().add(tA);

    view.pack();
    view.setVisible(true);

    TimeData currentTime = new TimeData(System.currentTimeMillis());

    tA.setText(currentTime.toTimeString());;
  }
}
