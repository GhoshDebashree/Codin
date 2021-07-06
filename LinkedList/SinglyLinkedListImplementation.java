package LinkedList;
public class SinglyLinkedListImplementation<T>{
  public class Node{
    public T data;
    public Node nextNode;
  }
  public int size;
  public Node headNode;
  public SinglyLinkedListImplementation(){
    headNode = null;
    size = 0;
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
  public void printList(){
    if(isEmpty() == true){
      System.out.println("list is emply");
      return;
      }
      Node temp = headNode;
      System.out.print("List : ");
      while(temp.nextNode != null){
        System.out.print(temp.data.toString() + " - >");
        temp = temp.nextNode;
    }
    System.out.println(temp.data.toString() + " - > null ");
}

  public static void main(String[] args) {
    SinglyLinkedListImplementation <Integer> s = new SinglyLinkedListImplementation<Integer>();
    s.printList();
    for(int i = 1 ; i<= 10; i++){
      s.insertAtHead(i);
      s.printList();
    }
    
  }
}

