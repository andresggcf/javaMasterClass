package Section7.lectures.composition;

import Section7.lectures.composition.room.Bed;
import Section7.lectures.composition.room.Table;
import Section7.lectures.composition.room.Wall;

public class Bedroom {
  private String name;
  private Wall wall1;
  private Wall wall2;
  private Wall wall3;
  private Wall wall4;
  private Bed bed;
  private Table table;

  public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Table table) {
    this.name = name;
    this.wall1 = wall1;
    this.wall2 = wall2;
    this.wall3 = wall3;
    this.wall4 = wall4;
    this.bed = bed;
    this.table = table;
  }

  public Table getTable (){
    return this.table;
  }

  public void makeBed (){
    System.out.println("Room -> Making bed");
    bed.make();
  }
}
