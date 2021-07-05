package Arrays.TestPrimeNumbers.Arrays;

public class FindUnique{
  public static int singleNumber(int[] arr) {
      for(int i = 0;i < arr.length; i++){
        int flag = 0;
        for(int j = 0 ; j < arr.length;j++){
            if (i == j) {
                continue;
            }

            if(arr[j] == arr[i]){
                flag = 1;
                break;
           }
        }
          if (flag == 0) {
              return arr[i];
          }
       }
      return 0;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,2,1,4};
    int res = singleNumber(arr);
    System.out.println(res);
  }

}