package Arrays;

 public class FindMax {
  public static int findMaxSumSubArray(int[] arr) {
      int sum =0;
      int result =0;
      int[] newArr = new int[arr.length];
      for(int i =0; i< arr.length; i++){
          sum =  sum + arr[i];
          newArr[i] = sum;
      }
      for(int i =0; i< arr.length -1; i++){
          if(newArr[i] > newArr[i+1]){
              int temp = newArr[i];
              newArr[i] = newArr[i+1];
              newArr[i+1] = temp;
              i = -1;
          }
      }
      result = newArr[arr.length - 1];
      return result;
  }
  public static void main(String[] args){
      int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
      int output = findMaxSumSubArray(arr);
      System.out.println(output);
  }
}