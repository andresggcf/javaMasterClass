package Section8.lectures.arrayList;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<>();

  public void addGroceryItem (String item){
    groceryList.add(item);
  }

  public void removeGroceryItem(int position) {
    String item = groceryList.get(position);
    groceryList.remove(position);
    System.out.println("Removed the item " + item + " from the list");
  }

  public void modifyGroceryList(int position, String newItem){
    groceryList.set(position, newItem);
    System.out.println("Set item " + (position + 1) + "to " + newItem);
  }

  public void printGroceryList(){
    System.out.println("You have " + groceryList.size() + " items in the list");
    for(int i = 0; i < groceryList.size(); i++){
      System.out.println((i+1) +". " + groceryList.get(i));
    }
  }

  public String findItem (String searchItem) {
    //true if the item exists in the list, otherwise false
    boolean contains = groceryList.contains(searchItem);

    //finds the position of the searchItem (-1 if not found)
    int position = groceryList.indexOf(searchItem);
    if(position >= 0){
      return groceryList.get(position);
    }
    return null;
  }
}
