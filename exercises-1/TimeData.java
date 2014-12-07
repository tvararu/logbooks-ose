public class TimeData {
  private long hours, minutes, seconds;

  public TimeData(long millis) {
    seconds = (millis / 1000) % 60;
    minutes = (millis / (60 * 1000)) % 60;
    hours = (millis / (60 * 60 * 1000)) % 24;
  }

  // This method will format a unit of time (seconds/minutes/hours)
  // to always have a prefixing 0 if it's less than 10, so that TimeData
  // objects display as HH:MM:SS instead of H:M:S.
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

  public long getHours() { return hours; }
  public long getMinutes() { return minutes; }
  public long getSeconds() { return seconds; }
}
