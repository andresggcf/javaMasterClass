package Section7.challenge.encapsulation;

public class Printer {
  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
    if(tonerLevel > 0 && tonerLevel <= 100){
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }
    this.pagesPrinted = 0;
    this.duplex = duplex;
  }

  public int getTonerLevel() {
    return tonerLevel;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public boolean isDuplex() {
    return duplex;
  }

  public void fillToner(int level) {
    int fillLevel = this.tonerLevel + level;
    if(level > 0) {
      if (fillLevel > 100) {
        fillLevel = 100;
      }
      this.tonerLevel = fillLevel;
    } else {
      this.tonerLevel =  -1;
    }
  }

  public int printPages(int pages){
    int pagesToPrint = pages;
    if(this.duplex){
      pagesToPrint = (pages / 2) + (pages % 2);
      System.out.println("Printing in duplex mode");
    }
    this.pagesPrinted += pagesToPrint;
    return pagesToPrint;
  }
}
