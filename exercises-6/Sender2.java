import java.net.*;
import java.io.*;

public class Sender2 {
  public static void main(String[] args) throws IOException {
    if (args.length != 3) {
      System.out.println("Exactly three arguments are needed for the main method:");
      System.out.println("The first one must specify a local port.");
      System.out.println("The second one must specify an Internet host.");
      System.out.println("And third one must specify a port on the host.");
      return;
    }

    int localPort = Integer.parseInt(args[0]);
    String remoteHost = args[1];
    int remotePort = Integer.parseInt(args[2]);

    InetAddress dAddr;
    dAddr = InetAddress.getByName(remoteHost);

    DatagramSocket mySocket;
    mySocket = new DatagramSocket(localPort);

    String message;
    byte[] data;
    DatagramPacket dP;

    System.out.println("Starting to send three messages from local port " + localPort + ".");

    for (int i = 1; i <= 215; i++) {
      message = "Message " + i;
      data = message.getBytes();
      dP = new DatagramPacket(data, data.length, dAddr, remotePort);

      mySocket.send(dP);
    }

    System.out.println("Messages have been sent.");
  }
}
