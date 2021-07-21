package Algorithms;

public class InsertionSort {

  public static void sorting(int[] array){            //Insertion sort every first two elements are checked and sorted.
    for(int i = 1; i< array.length;i++){
      int key = array[i];
      int j = i-1;
      while(j>=0 && array[j] > key){
        array[j+1] = array[j];
        j = j -1;
      }
      array[j+1] = key;
    }
  }

  public static void print(int[] array){
    System.out.println("The sorted list is : ");
    for(int j = 0; j < array.length; j++){
      System.out.print(array[j]);
    }
  }

  public static void main(String[] args) {
    int[] array = {3,6,1,8,2,9,-1,-2,0,10};
    sorting(array);
    print(array);

  }
  
}
