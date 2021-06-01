package Section7.lectures.composition.room;

public class Bed {
  private String Style;
  private int pillows;
  private int height;
  private String Size;

  public Bed(String style, int pillows, int height, String size) {
    Style = style;
    this.pillows = pillows;
    this.height = height;
    Size = size;
  }

  public void make() {
    System.out.println("Bed -> made");
  }
}
