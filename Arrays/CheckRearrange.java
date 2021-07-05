package Arrays;

class CheckReArrange {

  public static void reArrange(int[] arr) {
    int j = 0; 
    for (int i = 0; i < arr.length; i++) { 
      if (arr[i] < 0) {   // if negative number found
          int temp = arr[i];
          arr[i] = arr[j]; // swapping with leftmost positive
          arr[j] = temp;
       
        j++; 
      } 
    } 
  }
  public static void main(String[] args){
    int[] arr = {1,-1,3,-2,-4,3,5,2,-4,-2};
    
    reArrange(arr);
    for(int i = 0; i< arr.length; i++){
      System.out.println(arr[i]);
    
}
}
}