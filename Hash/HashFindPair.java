package Hash;

import java.util.HashMap;

public class HashFindPair {

  public static String  findPair(int[] array){
    HashMap<Integer,int[]> hmap = new HashMap<>();
    String result ="";
    for(int i =0; i<array.length;i++){
      for(int j =i+1;j<array.length;j++){
      int sum = array[i] + array[j];
    
  
  if(!hmap.containsKey(sum)){                                     //if pair does not exists.
    hmap.put(sum, new int[]{array[i],array[j]});
  }
  else{
    int[] prev_pair = hmap.get(sum);                              //if pair already exists.
    result+="{" +prev_pair[0]+ "," + prev_pair[1]+ "}{" +array[i]+ "," +array[j]+ "}";
  
    return result;                                                                              //Just to find the two pairs we put the return .
  
        }
      }
    }
    return result;
  }
    public static void main(String[] args) {
      int[] array = {1,2,3,4,5,6,9};
      String value = findPair(array);
      System.out.println(value);
      
    }
  }
