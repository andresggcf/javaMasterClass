package Section7.codingExercises.Exercise38;

public class Printer {
  private int tonerLevel;
  private int pagesPrinted = 0;
  private boolean duplex;

  public Printer(int tonerLevel, boolean duplex) {
    if(tonerLevel > -1 && tonerLevel <= 100){
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }
    this.duplex = duplex;
  }

  public int addToner(int tonerAmount){
    int result = tonerLevel + tonerAmount;
    if(tonerAmount > 0 && tonerAmount <= 100){
      if(result > 100){
        return -1;
      } else {
        tonerLevel = result;
        return result;
      }
    }
    return -1;
  }

  public int printPages(int pages) {
    int pagesToPrint = pages;
    if(duplex){
      pagesToPrint = (pages / 2) + (pages % 2);
    }
    pagesPrinted += pagesToPrint;
    return pagesToPrint;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }
}
