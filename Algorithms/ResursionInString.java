package Algorithms;
import java.lang.String;

public class ResursionInString {

  public static boolean recursion(String str, int s,int e){                   //check both there is only one character then return true,
    if(s == e) return true;                                                   //if the characcter at the starting index is not equal to the character at last return false
    if(str.charAt(s) != str.charAt(e)) return false;                            //otherwise keep checking the characters and filanlly return true.
    if(s<e) return recursion(str, s+1, e-1);
    return true;
  }

  public static boolean palindrome(String str){
    int n = str.length();
    if( n == 0) return true;
    return recursion(str, 0, n -1);
   

  }
  public static void main(String[] args) {
    String str = "madam";
    if(palindrome(str)){
      System.out.println("String is a palindrome");
    }
    else{
      System.out.println("String is not a palindrome");
    }
    
  }
 
}
