package Section7.lectures.composition;

import Section7.lectures.composition.computer.Case;
import Section7.lectures.composition.computer.Monitor;
import Section7.lectures.composition.computer.Motherboard;

public class Computer {
  private Case pcCase;
  private Monitor monitor;
  private Motherboard motherboard;

  public Computer(Case pcCase, Monitor monitor, Motherboard motherboard) {
    this.pcCase = pcCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  public Case getPcCase() {
    return pcCase;
  }

  public void setPcCase(Case pcCase) {
    this.pcCase = pcCase;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }

  public void setMotherboard(Motherboard motherboard) {
    this.motherboard = motherboard;
  }
}
