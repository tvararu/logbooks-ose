public class TimeDataSTest {
  public static void main(String[] args) {
    TimeDataS t1 = new TimeDataS(41014475);
    TimeDataS t2 = new TimeDataS(801361475);

    System.out.println(t1.toTimeString());
    System.out.println(t2.toTimeString());

    System.out.println(t1.earlierThan(t2));
    System.out.println(t2.earlierThan(t1));
    System.out.println(t1.earlierThan(t1));
  }
}
