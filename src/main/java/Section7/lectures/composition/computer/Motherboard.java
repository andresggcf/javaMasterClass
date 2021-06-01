package Section7.lectures.composition.computer;

public class Motherboard {
  private String model;
  private String manufacturer;
  private int ramSlots;
  private int cardSlots;

  public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.ramSlots = ramSlots;
    this.cardSlots = cardSlots;
  }

  public void loadProgram (String programName){
    System.out.println("Program name " + programName + " is now loading");
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public int getRamSlots() {
    return ramSlots;
  }

  public void setRamSlots(int ramSlots) {
    this.ramSlots = ramSlots;
  }

  public int getCardSlots() {
    return cardSlots;
  }

  public void setCardSlots(int cardSlots) {
    this.cardSlots = cardSlots;
  }
}
