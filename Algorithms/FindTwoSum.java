package Algorithms;

import java.util.HashMap;

class FindTwoSum {
  public static int[] findSum(int[] arr, int n) {
   int[] result = new int[2];
   HashMap < Integer, Integer > hmap = new HashMap < Integer, Integer > (); // Create a hashmap
 
   for (int i = 0; i < arr.length; i++) {
    if (hmap.containsKey(arr[i])) // If a value from arr is present in hmap
    {
     result[0] = hmap.get(arr[i]);
     result[1] = i;
     return result;
    }
    else {
      hmap.put(n - arr[i], i); // Store value - arr[i] if element is not present in arr
    }
   }
   return result;
  }
 
  public static void main(String args[]) {
 
   int n = 9;
   int[] arr = {2, 4, 3, 7, 8};
   int[] result = findSum(arr, n);
   System.out.println("Sum of " + n + " found: " + result[0] + " and " +result[1]);
  }
}
