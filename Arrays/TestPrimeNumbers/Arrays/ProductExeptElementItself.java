package Arrays.TestPrimeNumbers.Arrays;

public class ProductExeptElementItself {
  public static int[] findProduct(int[] arr){
    int[] res = new int[arr.length];
    int product = 1;
    int countZero = 0;
    for(int i =0 ; i< arr.length; i++){
      if(arr[i] == 0){
        countZero++;
      }
      else{
        product = product * arr[i];
      }
    }
      if(countZero > 1){
      return new int[arr.length];
    }
    for(int i =0 ; i< arr.length; i++){
      if(countZero > 0){
        if(arr[i] == 0){
          res[i] = product;
        }
      else{
        res[i] = 0;
        }
    }
      else{
        res[i] = product / arr[i];
    }
  }
  return res;
}
  
  
  public static void main(String[] args){
    int[] arr = {5,9,0,10};
    int[] proResult = findProduct(arr); 
     for(int k = 0; k< proResult.length; k++){
       System.out.println(proResult[k]);
     }
   }
  }
  

