package String;

public class removeWhitespace {
  public static void main(String[] args) {
    String str = "a hello abs world!";
    char[] strarray = str.toCharArray();
    StringBuilder strbl = new StringBuilder();
    for(int i =0; i <strarray.length; i++){
      if((strarray[i] !=' ') && (strarray[i] !='\t')){
      strbl.append(strarray[i]);
      }
    }
  System.out.println(strbl.toString());
 }
}
