package Arrays.TestPrimeNumbers.Arrays;

class CheckMinimumOne {

  public static int findMinimum(int[] arr) {
    int smallest = 0;
    for(int i = 0 ; i < arr.length; i++)  {
      for(int j = i+1; j < arr.length; j++){
        if(arr[i]<arr[j]){
          smallest = arr[i];
        }
        else{
          smallest = arr[j];
        }
      }
    }
    return smallest;
  }
  public static void main(String[] args){
    int[] arr = {10,20,30,2,7,5,1,0};
    int resultSmallest = findMinimum(arr);
    System.out.println("Smallest in the array is : " +resultSmallest);
  }
}