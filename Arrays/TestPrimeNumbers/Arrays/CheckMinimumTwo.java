package Arrays.TestPrimeNumbers.Arrays;

public class CheckMinimumTwo {
  public static int findMinimum(int[] arr) {
    int smallest = arr[0];
    for(int i = 1 ; i < arr.length; i++)  {
      if(arr[i]<smallest){
        smallest = arr[i];
      }
    }
      return smallest;
}
public static void main(String[] args){
  int[] arr = {10,20,30,2,7,5,1,3};
  int resultSmallest = findMinimum(arr);
  System.out.println("Smallest in the array is : " +resultSmallest);
  }
}
