package Hash;

import java.util.HashMap;

public class HashCheckSumZero {

  public static boolean ChecksumZero(int[] array){                  //To find the sum of elements in an array is eual to 0.
    HashMap<Integer,Integer> hmap = new HashMap<>();
    int sum = 0;
    for(int i =0; i<array.length;i++){
      sum+= array[i];
      if(sum==0||array[i]==0||hmap.get(sum)!= null) return true;
      hmap.put(sum, i);
    }
    return false;
  }
  public static void main(String[] args) {
    int[] array = {1,2,3,-4,1};
    System.out.println(ChecksumZero(array));
  }
  
}
