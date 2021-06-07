package Section7.codingExercises.Exercise40;

public class HealthyBurger extends Hamburger {
  private String healthyExtra1Name;
  private double healthyExtra1Price;
  private String healthyExtra2Name;
  private double healthyExtra2Price;


  public HealthyBurger(String meat, double price) {
    super("Healthy", meat, price, "Oregano Bread");
  }

  public void addHealthyAddition1(String name, double price) {
    healthyExtra1Name = name;
    healthyExtra1Price = price;
  }

  public void addHealthyAddition2(String name, double price) {
    healthyExtra2Name = name;
    healthyExtra2Price = price;
  }

  @Override
  public double itemizeHamburger() {
    double hamburgerPrice = super.itemizeHamburger();
    if (this.healthyExtra1Name != null){
      hamburgerPrice += this.healthyExtra1Price;
      System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
    }

    if (this.healthyExtra2Name != null){
      hamburgerPrice += this.healthyExtra2Price;
      System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }

    return hamburgerPrice;
  }
}
