public class SystemTimeTest {
  public static void main(String[] args) {
    long currentTime = System.currentTimeMillis();

    System.out.println(currentTime);

    TimeData tdCurrentTime = new TimeData(currentTime);

    System.out.println(tdCurrentTime.toTimeString());
  }
}
