import java.io.*;

public class ReadFile {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    if (args.length != 1) {
      System.out.println("The name of a single file is required");
      return;
    }
    FileInputStream f = new FileInputStream(args[0]);

    int val = f.read();
    if (val == -1) {
      System.out.println("File is empty");
      return;
    }

    while(val != -1) {
      System.out.print(val + " ");
      val = f.read();
    }
    System.out.println();
  }
}
