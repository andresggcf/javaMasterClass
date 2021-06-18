# Section 8: Arrays, Java inbuilt Lists, Autoboxing and Unboxing

## Arrays
A data structure that allows us to store multiple values of the same type into a 
single variable.

An array is a group of like-typed variables that are referred to by a common name.
Array can contain primitives (int, char, etc.) as well as object (or non-primitive) 
references of a class depending on the definition of the array. In case of primitive 
data types, the actual values are stored in contiguous memory locations. In case of 
objects of a class, the actual objects are stored in heap segment.

```java
class ExampleArray{
  //declare an array of 5 positions of type int:
  int[] array = new int[5];
  //or
  int[] myArray = {10,20,30,40,50};
}
```

##Reference Types vs Value Types
### Reference Types
A reference holds the address of an object, but not the object itself (like arrays are 
references to arrays in memory). So if we have two references pointing to the same memory 
address, then they will both change in value if we modify just one, for example: 
```java
class ExampleArray2{
  //both arrays hold the same address on memory
   int[] myIntArray = new int[5];
   int[] anotherArray = myIntArray;

   //System.out.println("myIntArray = " + Arrays.toString(myIntArray));
   //System.out.println("anotherArray = " + Arrays.toString(anotherArray));

   anotherArray[1] = 1;

   //System.out.println("after myIntArray = " + Arrays.toString(myIntArray));
   //System.out.println("after anotherArray = " + Arrays.toString(anotherArray));
}
```

will modify both outputs because myIntArray and anotherArray are pointing to the same
memory address.

### Value Types
Value types on the other hand do not point to a memory address, but to a value, for example
a variable of type int contains a 32bit version of a number. So primitive types
(byte, short, int, long, float, double, char and boolean) are value types.
 
##Resizing Arrays

To resize an array we can do the following:
```java
class ExampleArray2{
  int[] baseArray = new int[10];
  private static void resizeArray(){

    //make a copy of the original array;
    int[] original = baseArray;

    //initialize with a new size
    baseArray = new int[12];

    //create a loop to add the original values to the new array
    for (int i=0; i < original.length; i++){
      baseArray[i] = original[i];
    }
  }
}
```
But to prevent this kind of programming method, we rather use lists.

## Lists and Array Lists
List is an interface and an ordered collection (extends the Collections interface), that allows us to have items 
and their respective positions.

ArrayList is a resizable array (it does it automatically) as you can see in the [GroceryList Class](./lectures/arrayList/GroceryList.java).
where the list starts empty, with no declaration of the size or length, but we gradually add
items to the list



