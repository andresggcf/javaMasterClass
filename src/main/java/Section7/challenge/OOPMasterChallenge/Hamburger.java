package Section7.challenge.OOPMasterChallenge;

public class Hamburger {
  private String breadType;
  private String meat;
  private boolean lettuce;
  private boolean tomato;
  private boolean carrot;
  private boolean cheese;
  private double price;
  private double additionsPrice;
  private double itemPrice;
  private int count;

  public Hamburger(String breadType, String meat) {
    this.breadType = breadType;
    this.meat = meat;
    this.price = 4.99;
    this.additionsPrice = 0;
    this.count = 0;
  }

  public boolean addAddition(String addition){
    if(count <= 4) {
      switch (addition) {
        case "Lettuce":
          return addLettuce();
        case "Tomato":
          return addTomato();
        case "Carrot":
          return addCarrot();
        case "Cheese":
          return addCheese();
        default:
          System.out.println("This ingredient doesn't exist or isn't available.\n"
                  + "Please add one of the following:\n"
                  + "Lettuce\nTomato\nCarrot\nCheese");
          return false;
      }
    } else {
      System.out.println("Cannot add any more ingredients");
      return false;
    }
  }

  public boolean removeAddition(String addition){
    if(count >= 0) {
      switch (addition) {
        case "Lettuce":
          return removeLettuce();
        case "Tomato":
          return removeTomato();
        case "Carrot":
          return removeCarrot();
        case "Cheese":
          return removeCheese();
        default:
          System.out.println("This ingredient doesn't exist or isn't available.");
          return false;
      }
    } else {
      System.out.println("Cannot remove any more ingredients");
      return false;
    }
  }

  public int getCount() {
    return count;
  }

  public double getItemPrice(){
    return itemPrice;
  }

  private boolean addLettuce() {
    itemPrice = 0.50;
    if(!lettuce) {
      lettuce = true;
      additionsPrice +=  itemPrice;
      System.out.println("Lettuce added for a price of $" + itemPrice);
      count++;
      return true;
    } else {
      System.out.println("Lettuce was already added");
      return false;
    }
  }

  private boolean removeLettuce() {
    itemPrice = 0.50;
    if(lettuce) {
      lettuce = false;
      additionsPrice -=  itemPrice;
      System.out.println("Lettuce removed");
      count--;
      return true;
    } else {
      System.out.println("Lettuce was already removed");
      return false;
    }
  }

  private boolean addTomato() {
    itemPrice = 0.80;
    if(!tomato) {
      tomato = true;
      additionsPrice +=  itemPrice;
      System.out.println("Tomato added for a price of $" + itemPrice);
      count++;
      return true;
    } else {
      System.out.println("Tomato was already added");
      return false;
    }
  }

  private boolean removeTomato() {
    itemPrice = 0.80;
    if(tomato) {
      tomato = false;
      additionsPrice -=  itemPrice;
      System.out.println("Tomato removed");
      count--;
      return true;
    } else {
      System.out.println("Tomato was already removed");
      return false;
    }
  }

  private boolean addCarrot() {
    itemPrice = 0.30;
    if(!carrot) {
      carrot = true;
      additionsPrice +=  itemPrice;
      System.out.println("Carrot added for a price of $" + itemPrice);
      count++;
      return true;
    } else {
      System.out.println("Carrot was already added");
      return false;
    }
  }

  private boolean removeCarrot() {
    itemPrice = 0.30;
    if(carrot) {
      carrot = false;
      additionsPrice -=  itemPrice;
      System.out.println("Carrot removed");
      count--;
      return true;
    } else {
      System.out.println("Carrot was already removed");
      return false;
    }
  }

  private boolean addCheese() {
    itemPrice = 0.55;
    if(!cheese) {
      cheese = true;
      additionsPrice +=  itemPrice;
      System.out.println("Cheese added for a price of $" + itemPrice);
      count++;
      return true;
    } else {
      System.out.println("Cheese was already added");
      return false;
    }
  }

  private boolean removeCheese() {
    itemPrice = 0.55;
    if(cheese) {
      cheese = false;
      additionsPrice -=  itemPrice;
      System.out.println("Cheese removed");
      count--;
      return true;
    } else {
      System.out.println("Cheese was already removed");
      return false;
    }
  }
}
