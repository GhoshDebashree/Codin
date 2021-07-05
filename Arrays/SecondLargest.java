package Arrays;

public class SecondLargest {
  public static int secondLargest(int[] arr){
    int res = 0;
    for(int i = 0; i< arr.length; i++){
      for(int j = 0; j< arr.length; j++){
        if(arr[i]<arr[j]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
      }
    }
     res = arr[arr.length-2];
  }
  return res;
}
public static void main(String args[]){
  int[] arr = {30,2,44,18,19,67};
  int result = secondLargest(arr);
  
  System.out.println(result);
  }
}

