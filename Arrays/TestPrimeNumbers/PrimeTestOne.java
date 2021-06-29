package Arrays.TestPrimeNumbers;


public class PrimeTestOne {
  public static void main(String args[]){
    int m = 3;
    int n = 40;
   
    for(int j = m; j<= n; j++){
    for(int i = 2; i<m; i++){
      if(j % i == 0){
        System.out.println(j +"is a prime number");
      }
    }
  }
 }
}
  

