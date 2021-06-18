package Section8.lectures.arrayList;


import java.util.Scanner;

public class GLMain {
  private  GroceryList list;
  private static Scanner scanner = new Scanner(System.in);

  public GLMain(GroceryList list) {
    this.list = list;
  }

  public void execute() {
    boolean quit = false;
    int choice = 0;
    while (!quit) {
      System.out.println("Enter instruction");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          list.printGroceryList();
          break;
        case 2:
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchForItem();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  public void printInstructions(){
    System.out.println("\n Press: "
        + "\n 0. To print choice options"
        + "\n 1. To print list of grocery items"
        + "\n 2. To add an item to the list"
        + "\n 3. To modify an item in the list"
        + "\n 4. To remove an item in the list"
        + "\n 5. To search for an item in the list"
        + "\n 6. Quit");
  }

  public void addItem() {
    System.out.println("Please Enter grocery item: ");
    list.addGroceryItem(scanner.nextLine());
  }

  public void modifyItem(){
    System.out.println("Enter list number: ");
    int position = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter replacement item: ");
    String item = scanner.nextLine();
    list.modifyGroceryList(position - 1, item);
  }

  public void removeItem(){
    System.out.println("Enter element number on the list: ");
    int position = scanner.nextInt();
    scanner.nextLine();
    list.removeGroceryItem(position - 1);
  }

  public void searchForItem(){
    System.out.println("Enter the name of the item to look for: ");
    String searchItem = scanner.nextLine();
    if (list.findItem(searchItem) == null){
      System.out.println("No item was found");
    } else {
      System.out.println(searchItem + " was found");
    }
  }
}
