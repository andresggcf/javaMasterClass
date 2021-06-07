package Section7.challenge.OOPMasterChallenge;

public class HealthyBurger extends Hamburger {
  private boolean avocado;
  private boolean jalapeno;
  private int count;
  private double itemPrice;
  private double additionsPrice;

  public HealthyBurger(String meat) {
    super("Brown rye", meat);
    this.additionsPrice = 0;
    count = 0;
  }

  public int getACount() {
    return count;
  }

  @Override
  public boolean addAddition(String addition) {
    if(count <= 6){
      switch (addition){
        case "Avocado":
          return addAvocado();
        case "Jalapeno":
          return addJalapeno();
        default:
          boolean result = super.addAddition(addition);
          if(result){
            additionsPrice += super.getItemPrice();
            count++;
          }
          return result;
      }
    } else {
      return false;
    }
  }

  private boolean addAvocado() {
    itemPrice = 0.50;
    if(!avocado) {
      avocado = true;
      additionsPrice +=  itemPrice;
      System.out.println("Avocado added for a price of $" + itemPrice);
      count++;
      return true;
    } else {
      System.out.println("Avocado was already added");
      return false;
    }
  }

  private boolean removeAvocado() {
    itemPrice = 0.50;
    if (avocado) {
      avocado = false;
      additionsPrice -= itemPrice;
      System.out.println("Avocado removed");
      count--;
      return false;
    } else {
      System.out.println("Avocado was already removed");
      return true;
    }
  }

  private boolean addJalapeno() {
    itemPrice = 0.25;
    if(!jalapeno) {
      jalapeno = true;
      additionsPrice +=  itemPrice;
      System.out.println("Jalapenos added for a price of $" + itemPrice);
      count++;
      return true;
    } else {
      System.out.println("Jalapenos were already added");
      return false;
    }
  }

  private boolean removeJalapeno() {
    itemPrice = 0.25;
    if (jalapeno) {
      jalapeno = false;
      additionsPrice -= itemPrice;
      System.out.println("Jalapenos removed");
      count--;
      return false;
    } else {
      System.out.println("Jalapenos were already removed");
      return true;
    }
  }
}
