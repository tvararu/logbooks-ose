import java.io.*;

public class LengthOfFiles {
  public static void main(String[] files) {
    int a;

    for (int i = 0; i < files.length; i++) {
      System.out.println("Considering " + files[i]);

      try {
        a = lengthOf(files[i]);
        System.out.println("The length of " + files[i] + " is " + a);
      } catch(FileNotFoundException x) {
        System.out.println("Caught FileNotFoundException:"); System.out.println(x.getMessage());
      } catch(IOException y) {
        System.out.println("Caught IOException:");
        System.out.println(y.getMessage());
      }

      System.out.println("Finished with " + files[i]);
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
