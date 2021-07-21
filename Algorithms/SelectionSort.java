package Algorithms;

public class SelectionSort {

  public static void sorting(int[] array){                          //To find the minimum.
    for(int i =0 ;i < array.length ; i++){
      int minIndex = i;
      for(int j = i+1; j< array.length; j++){
        if(array[j] < array[i]){
          minIndex = j;

        
        int temp = array[minIndex];                               //After getting the minimum swap with the current index.
        array[minIndex] = array[i];
        array[i] = temp;

      }
    }
  }
    for(int i = 0;i< array.length; i++){
      System.out.print( array[i]);
    }
  }
  public static void main(String[] args) {
    int[] array = {2,6,7,8,11,1,9,0};
    sorting(array);
  }
  
}
