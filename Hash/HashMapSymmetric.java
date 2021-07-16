package Hash;

import java.util.HashMap;

public class HashMapSymmetric {

  public static String issymmetric(int[][] array){
                                                                      //Find the there is any subarray which is symmetric. We need HashMap which takes key and value.
    HashMap<Integer,Integer> hmap = new HashMap<>();
    String result ="";
    for(int i =0; i< array.length;i++){
      int first = array[i][0];
      int second = array[i][1];
    
    Integer value = hmap.get(second);                     
    if(value!= null && value == first){                                       //Check if its symmetric
      result+="{" +String.valueOf(second)+ "," + String.valueOf(first)+ "}" ;
    }
    else{
      hmap.put(first,second);
    }
  }
  return result;
}

public static void main(String[] args) {
  int[][] array = {{1,2},{3,4},{5,7},{2,1},{9,0},{0,9}};
  String str = issymmetric(array);
  System.out.println(str);
}



  
}
