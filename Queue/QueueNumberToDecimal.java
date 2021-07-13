package Queue;

public class QueueNumberToDecimal<V> {

  private int front;
  private int back;
  private int currentSize;
  private int maxSize;
  private V[] arr;



  public QueueNumberToDecimal(int maxSize){
    this.maxSize = maxSize;
    front = 0;
    back = -1;
    currentSize = 0;
    arr = (V[]) new Object[maxSize];
  }

  public boolean isEmpty(){
    return currentSize == 0;
  }
  public boolean isFull(){
    return currentSize == maxSize;
  }

  public V top(){
    return arr[front];
  }

  public void enqueue(V value){
    if(isFull()) return;
    back = (back + 1 )% maxSize;
    arr[back] = value;
    currentSize++;
  }
  
  public V dequeue(){
    if(isEmpty()) return null;
    V temp = arr[front];
    front = (front + 1) %maxSize;

    currentSize--;
    return temp;

  }

  public static String[] findBin(int number) {
    String[] result = new String[number];
    QueueNumberToDecimal<String> queue = new QueueNumberToDecimal<String>(number + 1);

    queue.enqueue("1");

    for (int i = 0; i < number; i++) {
        result[i] = queue.dequeue();
        String s1 = result[i] + "0";
        String s2 = result[i] + "1";
        queue.enqueue(s1);
        queue.enqueue(s2);
    }

    return result; //For number = 3 , result = {"1","10","11"};
}

public static void main(String args[]) {

    String[] output = findBin(5);
    for(int i = 0; i < 5; i++)
        System.out.print(output[i] + " ");
}
  }

