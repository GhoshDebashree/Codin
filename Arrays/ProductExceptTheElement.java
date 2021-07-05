package Arrays;

class ProductExecptTheElement  
{  
  public static int[] findProduct(int[] arr) {
    int[] res = new int[arr.length];
    for(int i = 0; i < arr.length; i++) {
        int mul = 1;
        for (int j = 0; j < arr.length; j++) {
            if(i == j) {
                continue;
            }
            mul *= arr[j];
        }
        res[i] = mul;
    }
    return res;
}
   public static void main(String[] agrs){
     int[] arr = {5, 0, 3, 4};
     int[] proResult = findProduct(arr); 
     for(int k = 0; k< proResult.length; k++){
       System.out.println(proResult[k]);
     }
   }
} 