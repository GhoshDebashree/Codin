package Hash;

import java.util.Map;
import java.util.TreeMap;

public class HashFirstUnique {
  public static int firstUnique(int[] array){
    Map<Integer,Integer> map = new TreeMap<>();
    for(int i =0; i< array.length;i++){
      if(map.containsKey(array[i])){
         int occurance = map.get(array[i]) + 1;                 //Update the occurance.
         map.put(array[i],occurance);
      }
      else{
        map.put(array[i], 0);
      }
    }
    for(int i =0; i< array.length;i++){
    if(map.get(array[i])==0){
      return array[i];
    }
  }
  return -1;
  }
public static void main(String[] args) {
  int[] array = {1,1,2,2,4,4,6,7,7};
  System.out.println(firstUnique(array));
}


}
