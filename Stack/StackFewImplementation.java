package Stack;

public class StackFewImplementation<V> {
  private int maxSize;
  private int top;
  private V arr[];


public StackFewImplementation(int max_size){
  this.maxSize = max_size;
  this.top = -1;
  arr = (V[]) new Object[max_size];
}

public int getCapacity(){
  return maxSize;
}

public boolean isEmpty(){
  return top == -1;
}

public boolean isFull(){
  return top == maxSize-1;
}

public V top(){
  if(isEmpty())return null;
  else{
    return arr[top];
  }
}




  public static void main(String[] args) {
    
  StackFewImplementation<Integer> s = new StackFewImplementation<Integer>(10);
  if(s.isEmpty()){
    System.out.println("Stack is empty");
  }
  else{
    System.out.println("Stack is not empty");
  }

  if(s.isFull()){
    System.out.println("Stack is full");
  }
  else{
    System.out.println("Stack is not full");
  }
}

}

  

