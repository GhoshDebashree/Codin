package Hash;

public class HashFunctions {

  public static int findHash(int key, int chunks){
    System.out.println("Key"+ key);
    String strkey = Integer.toString(key);
    System.out.println("Chunk Size is:" +chunks);
    int hashVal =0;
    for(int i =0; i<strkey.length();i+=chunks){                   //if chunk size is less than the length of string then calculate and create a chunk of given size
      if(i+chunks < strkey.length()){
        System.out.println(strkey.substring(i,i+chunks));
        hashVal+=Integer.parseInt(strkey.substring(i,i+chunks));
        
    }
    else{
        System.out.println(strkey.substring(i,strkey.length()));                //else return the complete string.
        hashVal+= Integer.parseInt(strkey.substring(i,strkey.length()));
    }
  }
  return hashVal;
  
}
public static void main(String[] args) {
  int key = 123456789;
  int chunks = 2;
  findHash(key, chunks);
  }
}

