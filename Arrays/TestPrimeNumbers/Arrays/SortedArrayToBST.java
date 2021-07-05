package Arrays.TestPrimeNumbers.Arrays;

public class SortedArrayToBST {
  int [] nums;
       public TreeNode sortedArrayToBST(int[] nums) {
           this.nums = nums;
           return nodeCal(0,nums.length - 1);
           
       }
       public TreeNode nodeCal(int left, int right){
           if(left > right) return null;
           int mid = (left+right)/2;
           TreeNode root = new TreeNode(nums[mid]);
           root.left = nodeCal(left,mid-1);
           root.right = nodeCal(mid+1,right);
           return root;
       }
   
  public  class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
     void preOrder(TreeNode node) {
      if (node == null) {
          return;
      }
      System.out.print(node.val + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
     public static void main(String[] args) {
      SortedArrayToBST tree = new SortedArrayToBST();
      int nums[] = {1,3};
      TreeNode root = tree.sortedArrayToBST(nums);
      tree.preOrder(root);
    }
  }
       
  

