package Arrays;

public class FindMaxInSlidingWindow {
  
    public static int[] findMaxSlidingWindow(int[] arr, int windowSize) {
        int max = 0;
        int [] result = new int[arr.length - windowSize + 1];
      for (int i = 0; i <= arr.length - windowSize; i++){
          int j = i;
          max = arr[j];
          while (j < windowSize + i) {
              if(max < arr[j]) {
                  max = arr[j];
              }
              j++;   
          }
          result[i] = max;
      }
    return result; 
    } 
   
  public static void main(String[] args) {
    int arr[] ={2,1,4,5,7,10,6,8}; // 6; 8 - 3 = 5 + 1
    int windowSize = 3;
    int[] result = findMaxSlidingWindow(arr,windowSize);
    for(int i =0; i < result.length; i++){
      System.out.println(result[i]);
        }
    
    }

}
