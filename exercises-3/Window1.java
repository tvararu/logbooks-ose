import javax.swing.*;

public class Window1 {
  public static void main(String[] args) {
    JFrame win = new JFrame("Window");
    JTextArea tA = new JTextArea(10, 30);

    win.getContentPane().add(tA);
    win.pack();
    win.setVisible(true);

    tA.setText("This is an editable text area");
  }
}
