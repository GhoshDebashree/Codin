package Arrays.TestPrimeNumbers.Arrays;

public class CheckIndex {
  
    public static int searchInsert(int[] nums, int target) {
        int low = 0; int high = nums.length - 1;
        int mid = 0;
       
        while( low <= high){
            mid = low + ((high - low) / 2);
            
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }
            else if(target < nums[mid]){
                high = mid -1;
            }
            
        }
      return high + 1;
    }

    public static void main(String[] args){
      int [] nums = {1,3,4,5,6,7};
      int target = 6;
      int result = searchInsert(nums,target);
      System.out.println(result);
    }
    
} 

