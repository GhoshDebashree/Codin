package Arrays;

public class CheckMaxMin {

    public static void maxMin(int[] arr) {
        int[] newArr = new int[arr.length];
      for(int i =0; i< arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
          }
          int j = 0;
          int k = 0;
      for(int i = 0; i< arr.length; i= i+2){  
            newArr[i] = arr[arr.length - 1 -j];
            j++;
      }
      for(int i =1; i< arr.length; i= i+2){
            newArr[i] = arr[k];
            k++;
      }
      for(int i =0; i< newArr.length; i++){
          System.out.println(newArr[i]);
      }
    }
  
      public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        maxMin(arr);
      }
  }
  

