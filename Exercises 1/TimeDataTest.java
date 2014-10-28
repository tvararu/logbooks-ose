public class TimeDataTest {
  public static void main(String[] args) {
    String s1, s2;
    TimeData t1, t2;

    t1 = new TimeData(35000);
    t2 = new TimeData(9999321);

    s1 = t1.toTimeString();
    s2 = t2.toTimeString();

    System.out.println(s1);
    System.out.println(s2);
  }
}
