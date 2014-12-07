public class Timer {
  public static void pause(long seconds) {
    long startUpTime = System.currentTimeMillis();

    while (System.currentTimeMillis() - startUpTime < seconds * 1000) {}
  }
}
