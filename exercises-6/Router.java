import java.net.*;
import java.io.*;

public class Router {
  public static void main(String[] args) throws IOException {
    if (args.length != 2) {
      System.out.println("usage: router <host> <port>");
      return;
    }
    String host = args[0];
    int port = Integer.parseInt(args[1]);

    InetAddress dAddr = InetAddress.getByName(host);

    int localPort = 5555;

    DatagramSocket mySocket = new DatagramSocket(5555);

    byte[] dataStore = new byte[2000];
    DatagramPacket dP = new DatagramPacket(dataStore, dataStore.length);

    System.out.println("Routing packets from port 5555 to " + host + ":" + port + ".");

    while (true) {
      mySocket.receive(dP);
      dP.setAddress(dAddr);
      dP.setPort(port);
      mySocket.send(dP);
    }
  }
}
