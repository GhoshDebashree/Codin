package Stack;


public class StackPostFix<V> {

  private int maxsize;
  private int currentsize;
  private int top;
  private V array[];



  public StackPostFix(int maxsize){
    this.maxsize = maxsize;
    top = -1;
    currentsize =0;
    array= (V[]) new Object[maxsize];

  }

  public int getmaxSize(){
    return maxsize;
  }
  
  public int getcurrentSize(){
    return currentsize;
  }

  public V top(){
    if(isEmpty()) return null;
    return array[top];
  }

  public boolean isEmpty(){

    return top == -1;
  }

  public boolean isFull(){

    return top == maxsize -1;
  }


  public void push(V value){
    if(isFull()) return ;
    array[++top] = value;
    currentsize++;
  }

  public V pop(){
    if(isEmpty()) return null;

    currentsize--;
    return array[top--];
  }


  public static int eval(String exp){                                     //Evaluate postfix expression
    StackPostFix<Integer> s = new StackPostFix<>(exp.length());

    for(int i =0; i<exp.length(); i++){
      char ch = exp.charAt(i);
      if(!Character.isDigit(ch)){                                       //If character is not a digit then pop the characters and do the operation.
        Integer x = s.pop();
        Integer y = s.pop();
        switch(ch){
          case '+':
                    s.push(y+x);
                    break;
          case '-':
                    s.push(y-x);
                    break;
          case '*':
                    s.push(y*x);
                    break; 
          case '/':
                    s.push(y/x);
                    break;                   
        }

      }
      else{
        s.push(Character.getNumericValue(ch));
      }
    }
    return s.pop();
  }

  public static void main(String[] args) {
    System.out.println(eval("142*-3-4+"));
  }
}
