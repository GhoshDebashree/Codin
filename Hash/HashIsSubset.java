package Hash;

import java.util.HashSet;

public class HashIsSubset {

  public static boolean isSubset(int[] arr1,int[] arr2){                    //if Hashset is empty then fill with the array1.
    HashSet<Integer> hset = new HashSet<>();
    for(int i =0; i<arr1.length;i++){
      if(!hset.contains(arr1[i])){
        hset.add(arr1[i]);

      }
    }
      for(int i =0; i<arr2.length;i++){                                   //Check array2/array3 is a subset or not.
        if(!hset.contains(arr2[i])){
        return false;
      }
    }
    
    return true;
  }
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5,6};
    int[] arr2 = {2,3,4};
    int[] arr3 = {1,0,3};
    System.out.println("Check whether array2 is a subset of array1");
    System.out.println(isSubset(arr1,arr2));
    System.out.println("Check whether array3 is a subset of array1");
    System.out.println(isSubset(arr1,arr3))
  }
  
}
