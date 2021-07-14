package Stack;

public class StackParenthesisCheck<V> {

  private int maxsize;
  private int currentsize;
  private int top;
  private V[] array;


  public StackParenthesisCheck(int maxsize){
    this.maxsize = maxsize;
    top = -1;
    currentsize =0;
    array = (V[]) new Object[maxsize];
  }

  public int getmaxsize(){
    return maxsize;
  }
  
  public int getcurrentsize(){
    return currentsize;
  }

  public boolean isEmpty(){
    return top == -1;
  }
  public boolean isFull(){
    return top == maxsize -1;
  }


  public V top(){
    if(isEmpty()) return null;
    return array[top];
  }

  public void push(V value){
    if(isFull()) return;
    array[++top] = value;
    currentsize++;
  }
  
  public V pop(){
    if(isEmpty()) return null;
    currentsize--;
    return array[top--];
  }


  public static boolean Check(String exp){
    StackParenthesisCheck<Character> stack = new StackParenthesisCheck<Character>(exp.length());
    for(int i =0; i<exp.length();i++){
      char ch = exp.charAt(i);
      if(ch == ')' || ch == '}' || ch == ']') {
        //if(stack.isEmpty()) return false;
          if((ch == ')' && stack.pop() != '(') || (ch == '}' && stack.pop() != '{') || (ch == ']' && stack.pop() != '[')) return false;
      }
      else{
        stack.push(ch) ;
      }
    }
      if(!stack.isEmpty()) return false;
      return true;
    }
    public static void main(String[] args) {
      System.out.println(Check("{(()]}"));
    }
  }
