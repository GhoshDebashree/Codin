package Queue;

public class QueueImplementation<V> {
  private V[] arr;
  private int front;
  private int back;
  private int currentSize;
  private int maxsize;



  public QueueImplementation(int maxsize){
    this.maxsize = maxsize;
    front = 0;
    back = -1;
    currentSize = 0;
    arr = (V[]) new Object[maxsize];
  }

  public boolean isEmpty(){
    return currentSize == 0;
  }
  public boolean isFull(){
    return currentSize == maxsize;
  }
  public int getSize(){
    return currentSize;
  }

  public int getMaxSize(){
    return maxsize;
  }

  public V top(){
    return arr[front];
  }
  
  public void enqueue(V value){                           //inserting value from back.
    if(isFull()) {
      return;
    }
    back = back+1 %maxsize;
    arr[back] = value;
    currentSize++;
  }


  public V dequeue(){                                     //deleting value from front.
    if(isEmpty())
      return null;
      V temp = arr[front];
    front = front+1 %maxsize;
    currentSize--;
    return temp;
  }



public static void main(String[] args) {
  QueueImplementation<Integer> q = new QueueImplementation<Integer>(10);
  q.enqueue(1);
  q.enqueue(2);
  q.enqueue(3);
  q.enqueue(4);
  System.out.println("After removing");
  q.dequeue();
  
  
  }
}
