package Section8.challenge.reverseArray;

public class ReverseArray {
  public int[] reverse(int[] array) {
    int maxIndex = array.length - 1;
    int[] reversedArray =  new int[array.length];
    for (int value : array) {
      reversedArray[maxIndex] = value;
      maxIndex -= 1;
    }
    return reversedArray;
  }
}
