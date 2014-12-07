public class TimeDataSXTest {
  public static void main(String[] args) {
    TimeDataSX t1 = new TimeDataSX(41014475);
    TimeDataSX t2 = new TimeDataSX(801361475);
    TimeDataSX t3 = new TimeDataSX(123688943);

    System.out.println(t1.toTimeString());
    System.out.println(t2.toTimeString());
    System.out.println(t3.toTimeString());

    System.out.println(t1.sameAs(t2));
    System.out.println(t2.sameAs(t1));
    System.out.println(t3.sameAs(t2));
    System.out.println(t3.sameAs(t3));
  }
}
