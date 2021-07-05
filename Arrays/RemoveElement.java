package Arrays;

class RemoveElement {
  public static int removeElement(int[] nums, int val) {
      int i = 0;
      for(int j = 0;j < nums.length; j++){
          if(nums[j] == val){
              continue;
          }
          else {    
              nums[i] = nums[j];
                 i++;
          }
        }
      
  return i ; 
      
}
  public static void main(String[] args){
    int[] nums = {1,2,3,4,5};
    int val = 3;
    int res = removeElement(nums,val);
    System.out.println(res);
   }
}