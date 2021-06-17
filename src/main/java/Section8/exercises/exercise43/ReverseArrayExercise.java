package Section8.exercises.exercise43;

public class ReverseArrayExercise {
  public void reverse(int[] array) {
    int length = array.length;
    int maxIndex = length -1;
    int halfLength = length/2 ;

    for (int i = 0; i < halfLength; i++){
      int temp = array[i];
      array[i] = array[maxIndex - i];
      array[maxIndex - i] = temp;
    }
  }
}
