package Stack;

public class StackCreate<V> {

  private int maxSize;
  private int top;
  private V arr[];
  


public StackCreate(int max_size){

  this.maxSize = max_size;
  this.top = -1;
  arr = (V[]) new Object[max_size];
}

public int getCapacity(){
  return maxSize;
  }
}

class StackImplementation{
public static void main(String[] args) {
  StackCreate<Integer> s = new StackCreate<Integer>(10);
  System.out.println("Stack is created");
  
  }
} 