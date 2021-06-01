package Section7.lectures.polymorphism;

public class StarWars extends Movie{
  public StarWars() {
    super("Star Wars");
  }

  @Override
  public String plot(){
    return "Imperial forces try take over galaxy";
  }
}