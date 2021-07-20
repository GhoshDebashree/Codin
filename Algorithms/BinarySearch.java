package Algorithms;

public class  BinarySearch {
  public static int findElement(int[] array, int element){
  int low = 0;
  int high = array.length -1;
  while(low <= high){
    int mid = low+(high - low)/2;                         //To calculate the mid element its low+(high-low)/2
    if(array[mid] == element){
      return mid;
    }
    else if( array[mid] < element){
      low = mid + 1;
    }
    else
    high = mid -1;
  }
  return -1;
}

public static void main(String[] args) {
  int[] array = {2,3,4,5,6,7,8,9};
  int element = 5;
  int result = findElement(array,element);
  System.out.println("The element is in "+result+ " th position");
  if(result == -1){
    System.out.println("Element not found");
    }
  }
}