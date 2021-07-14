package Stack;

public class StackSort<V> {
  private int maxsize;
  private int currentsize;
  private int top;
  private V[] array;

  public StackSort(int maxsize){
    this.maxsize = maxsize;
    currentsize =0;
    top = -1;
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
    return top == maxsize-1;
  }

  public void push(V value){
    if(isFull()) return;
    array[++top] = value;
    currentsize++;

  }

  public V pop(){
    if(isEmpty()) return null;
    currentsize -- ;
    return array[top--];
  }

  public V top(){
    if(isEmpty()) return null;
    return array[top];
  }



public static void sort(StackSort<Integer> stack){
  StackSort<Integer> newstack = new StackSort<Integer>(stack.getmaxsize());
  while(!stack.isEmpty()){
    Integer value = stack.pop();
    if(!newstack.isEmpty() && value >= newstack.top()){
      newstack.push(value);
    }
  else{
    while(!newstack.isEmpty() && value < newstack.top())
      stack.push(newstack.pop());
    newstack.push(value);
    
  }
}
    while(!newstack.isEmpty())
      stack.push(newstack.pop());
    }

  
  public static void main(String[] args) {
    StackSort<Integer> stack = new StackSort<Integer>(6);
    stack.push(4);
    stack.push(1);
    stack.push(3);
    stack.push(10);
    stack.push(5);
    sort(stack);
    while(!stack.isEmpty()){
    
      System.out.println(stack.pop());
    }
    
  }

}

