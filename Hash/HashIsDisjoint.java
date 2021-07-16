package Hash;


import java.util.HashSet;

public class HashIsDisjoint {

  public static boolean isDisjoint(int[] arr1, int[] arr2){
    HashSet<Integer> hset = new HashSet<>();
    for(int i= 0 ; i<arr1.length;i++){
      if(!hset.contains(arr1[i])){
        hset.add(arr1[i]);
      }
    }
    for(int i =0; i< arr2.length;i++){                                  //if any of the element of array2/array3/array4 is present in array1. Then its not disjoint.
      if(hset.contains(arr2[i])) return false;
    }
    return true;
  }
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6,7};
    int[] arr2 = {3,4,5};
    int[] arr3 = {4,8,9};
    int[] arr4 = {0,9,8};
    System.out.println(isDisjoint(arr1,arr3));
  }
  
}
