package Arrays.TestPrimeNumbers.Arrays;

public class SecondLargestTwo {
  public static int secondLargest(int[] arr){
  int large = arr[0];
  int secondlarge = arr[0];
    for(int i = 0; i< arr.length; i++){
      if(arr[i]> large){
        secondlarge = large;
        large = arr[i];
      }
      else if(arr[i] > secondlarge)
        {
          secondlarge = arr[i];
        }

      }
      return secondlarge;
  
}
public static void main(String args[]){
  int[] arr = {30,2,44,18,19,67};
  int result = secondLargest(arr);
  
  System.out.println(result);
  }
}


