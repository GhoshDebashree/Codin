package Arrays;

class FindSum{
  public static int[] twoSum(int[] arr, int target) {
      
      for(int i =0 ;i <arr.length;i++){
          
          for(int j = i+1;j<arr.length;j++){
            
              
              if(target == arr[i] + arr[j] )
              {

                  return new int[]{i,j};
              }
          }
      
      }
          throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[] args){
      int[] arr = {2,3,4,2};
      int target = 7;
      int [] res = twoSum(arr,target);
      for(int i =0 ;i <arr.length;i++){
          System.out.println(res[i]);
       }
  }
}