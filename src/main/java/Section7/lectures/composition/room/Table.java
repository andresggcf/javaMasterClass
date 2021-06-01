package Section7.lectures.composition.room;

public class Table {
  private String material;
  private int height;
  private String color;

  public Table(String material, int height, String color) {
    this.material = material;
    this.height = height;
    this.color = color;
  }

  public void turnOn(){
    System.out.println("Lamp -> turned on");
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
