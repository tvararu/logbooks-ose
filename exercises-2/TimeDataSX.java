public class TimeDataSX extends TimeDataS {
  public TimeDataSX(long millis) {
    super(millis);
  }
  public boolean sameAs(TimeData t) {
    if (
      (getHours() == t.getHours()) &&
      (getMinutes() == t.getMinutes()) &&
      (getSeconds() == t.getSeconds())
    ) {
      return true;
    } else {
      return false;
    }
  }
}
