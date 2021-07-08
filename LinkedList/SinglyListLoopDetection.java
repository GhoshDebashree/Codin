package LinkedList;

public class SinglyListLoopDetection<T> {
  
  public class Node{
    public T data;
    public Node nextNode;
  }

  public int size;
  public Node headNode;

  public SinglyListLoopDetection(){
    size = 0;
    headNode = null;
  }

  public boolean isEmpty(){
    if(headNode == null) return true;
    return false;
  }

  public void insertAtHead(T data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.nextNode = headNode;
    headNode = newNode;
    size++;
  }

  public void insertAtEnd(T data){
    if(isEmpty()){
      insertAtHead(data);
      return;
    }
    Node newNode = new Node();
    newNode.data = data;
    newNode.nextNode = null;

    Node last = headNode;
    while(last.nextNode != null){
      last = last.nextNode;
    }
    last.nextNode = newNode;
    size++;
  }

  public void printList(){
    if(isEmpty()){
      System.out.println("List is empty");
      return;
    }

    Node temp = headNode;
    System.out.print("List is :");

    while(temp.nextNode != null){
      System.out.print(temp.data.toString()+ " - > ");
      temp =temp.nextNode;
    }
    System.out.println(temp.data.toString()+ " - > null");
  }

  public static <T> boolean detectLoop(SinglyListLoopDetection<T> list){    //Check with two pointers fast and slow where slow is incremented by 1 and fast by 2.
    SinglyListLoopDetection<T>.Node slow = list.headNode;
    SinglyListLoopDetection<T>.Node fast = list.headNode;

    while(slow != null && fast !=null && fast.nextNode != null){
      slow = slow.nextNode;
      fast = fast.nextNode.nextNode;
      if(slow == fast){                                                // Once they match the loop  is found.
        return true;
      }
    }
    
    return false;
  }

  public static void main(String[] args) {
    SinglyListLoopDetection<Integer> list = new SinglyListLoopDetection<Integer>();
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    System.out.println("Before adding loop: " + detectLoop(list));
    
    list.headNode.nextNode.nextNode = list.headNode;
    System.out.println("After adding loop: " + detectLoop(list));
  }
}
