public class TimeData {
  public long hours, minutes, seconds;

  public TimeData(long millis) {
    seconds = (millis / 1000) % 60;
    minutes = (millis / (60 * 1000)) % 60;
    hours = (millis / (60 * 60 * 1000)) % 24;
  }

  private String Format(long timeUnit) {
    String prefix = (timeUnit < 10) ? "0" : "";
    return prefix + String.valueOf(timeUnit);
  }

  public String toTimeString() {
    return (
      Format(hours) + ":" +
      Format(minutes) + ":" +
      Format(seconds)
    );
  }
}
