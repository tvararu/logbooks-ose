import java.net.*;
import java.io.*;

public class Receiver1 {
  public static void main(String[] args) throws IOException {
    if (args.length != 1) {
      System.out.println("Exactly one argument specifying a local port is needed for the main method.");
      return;
    }

    int localPort = Integer.parseInt(args[0]);

    DatagramSocket mySocket;
    mySocket = new DatagramSocket(localPort);

    String messagePrefix;
    String message;

    byte[] dataStore = new byte[2000];
    DatagramPacket dP = new DatagramPacket(dataStore, dataStore.length);

    boolean go = true;

    System.out.println("Receiver1 has started receiving datagrams on local port " + localPort + ".");

    while (go) {
      mySocket.receive(dP);
      messagePrefix = "From host " + dP.getAddress().toString() + " on port " + dP.getPort() + ": ";
      message = messagePrefix + new String(dataStore, 0, dP.getLength());
      System.out.println(message);
    }
  }
}
