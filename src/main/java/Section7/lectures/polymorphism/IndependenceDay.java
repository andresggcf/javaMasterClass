package Section7.lectures.polymorphism;

public class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  @Override
  public String plot(){
    return "Aliens take over earth";
  }
}
