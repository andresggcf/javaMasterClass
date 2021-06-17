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
 




