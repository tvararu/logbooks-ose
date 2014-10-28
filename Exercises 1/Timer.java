public class Timer {
  public static void pause(long n) {
    long startUpTime;

    startUpTime = System.currentTimeMillis();

    while (System.currentTimeMillis() - startUpTime < n * 1000) {}
  }
}
