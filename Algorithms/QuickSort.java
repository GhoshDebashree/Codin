package Algorithms;

public class QuickSort {
  public static int partition(int[] array, int start,int end){
    int pivot = array[end];
    int partIndex = start;
    for(int i = start; i<end; i++){
      if(array[i] < pivot){
        int temp = array[i];                                //swap for the left of pivot.
        array[i] = array[partIndex];
        array[partIndex] = temp;
        partIndex++;
        }
      }
        int temp = array[partIndex];                        //swap for the right of pivot(which is greater than pivot)
        array[partIndex] = array[end];
        array[end] = temp;
        
        return partIndex;
  }

  public static void sort(int[] array ,int start,int end){
    
    if(start < end){
       int partIndex = partition(array, start, end);
       sort(array,start,partIndex -1);
       sort(array,partIndex + 1,end);
    }
  }
   
  public static void printArray(int[] array){
    for(int i =0; i< array.length;i++){
      System.out.println(array[i]);
    }
  }
  
  public static void main(String[] args) {
    int[] array = {5,3,7,2,9,-1,0,-2,10};
    int start = 0;
    int end = array.length -1;
    sort(array,start,end);
    printArray(array);
    }
  }
  
  
 

