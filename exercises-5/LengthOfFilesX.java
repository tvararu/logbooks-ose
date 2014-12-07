import java.io.*;

public class LengthOfFilesX {
  public static void main(String[] files) throws FileNotFoundException, IOException {
    int a;

    for (int i = 0; i < files.length; i++) {
      a = lengthOf(files[i]);
      System.out.println("The length of " + files[i] + " is " + a);
      System.out.println();
    }
  }

  public static int lengthOf(String nameOfFile) throws FileNotFoundException, IOException {
    FileInputStream f;
    int byteCount;

    f = new FileInputStream(nameOfFile);
    byteCount = 0;

    while(f.read() != -1) {
      byteCount = byteCount + 1;
    }

    return byteCount;
  }
}
