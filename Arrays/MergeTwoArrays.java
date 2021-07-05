package Arrays;

class MergeTwoArrays
{ 
    public static void main(String[] args){
      int[] arr1 = {1, 2, 3, 4, 5};
      int[] arr2 = {6, 7, 8, 9, 10};
      int[] newmerged = mergeArrays(arr1, arr2);
      for(int j =0; j< newmerged.length; j++){
      System.out.println(newmerged[j]);
      }
    }
    // merge arr1 and arr2 into a new result array 
    public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {
      int[] merged = new int[10];
    
      for(int i = 0;i < arr1.length; i++){
        merged[i] = arr1[i];
      }

      for(int k = 0; k<arr2.length; k++){
       merged[arr1.length+k] = arr2[k];
      }
      return merged ;// make a new resultant array and return your results in that
    } 
}
