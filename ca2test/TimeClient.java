import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class TimeClient {
  public static void main(String[] args) throws IOException {
    if (args.length != 3) {
      System.out.println("usage: java TimeClient <local_port> <address> <remote_port>");
      return;
    }

    int localPort = Integer.parseInt(args[0]);
    InetAddress dAddr = InetAddress.getByName(args[1]);
    int remotePort = Integer.parseInt(args[2]);

    DatagramSocket sock = new DatagramSocket(localPort);

    byte[] message = "Time".getBytes();
    DatagramPacket out = new DatagramPacket(message, message.length, dAddr, remotePort);

    byte[] buffer = new byte["HH:MM:SS".length()];
    DatagramPacket in = new DatagramPacket(buffer, buffer.length);

    JFrame win = new JFrame("Time Client");
    Container cont = win.getContentPane();
    cont.setBackground(Color.orange);

    BorderLayout bL = new BorderLayout();
    bL.setVgap(5);
    cont.setLayout(bL);

    JLabel nLabel = new JLabel("Time Client is running on port " + localPort);
    nLabel.setHorizontalAlignment(JLabel.CENTER);
    nLabel.setOpaque(true);
    nLabel.setBackground(Color.green);
    cont.add(nLabel, BorderLayout.NORTH);

    JTextArea tA = new JTextArea(10, 30);
    JScrollPane sP = new JScrollPane(tA);
    sP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    cont.add(sP, BorderLayout.CENTER);

    win.pack();
    win.setVisible(true);

    for (int i = 0; i < 10; i++) {
      sock.send(out);
      sock.receive(in);
      tA.setText("The time on the server is " + new String(buffer, 0, buffer.length) + "\n");
      Timer.pause(1);
    }
  }
}
