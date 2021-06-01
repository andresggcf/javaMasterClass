package Section6.lectures.staticvinstance;

public class Dog {
  private static String name;

  public Dog (String name){
    Dog.name = name;  //static variable accessed via instance "Dog"
  }

  public void printName() {
    System.out.println("Name= " + name);
  }
}
