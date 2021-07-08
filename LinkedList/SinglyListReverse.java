package LinkedList;

public class SinglyListReverse<T> {

  public class Node{

    public T data;
    public Node nextNode;

  }

  public Node headNode;
  public int size;

  public SinglyListReverse(){
    headNode = null;
    size = 0;
  }

  public boolean isEmpty(){
    if(headNode == null) return true;
    return false;
  }

  public void insertAtHead(T data){
    Node newNode = new Node();
    newNode.data =data;

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
    System.out.println("List is : ");
    while(temp.nextNode != null){
      System.out.print(temp.data.toString()+ " - > ");
      temp =temp.nextNode;
    }
    System.out.print(temp.data.toString()+ " - > null");

  }


public static void main(String[] args) {
  SinglyListReverse<Integer> list = new SinglyListReverse<Integer>();
  for(int i =1; i<=10;i++){
    list.insertAtEnd(i);
  }
  System.out.println("List before reverse");
  list.printList();
  System.out.println("\n After reversing ");
  reverse(list);
  list.printList();
}



  public static <T> void reverse(SinglyListReverse<T> list){
    SinglyListReverse<T>.Node prev = null;
    SinglyListReverse<T>.Node next = null;
    SinglyListReverse<T>.Node curr = list.headNode;

    while(curr != null){
      next = curr.nextNode;
      curr.nextNode = prev;
      prev = curr;
      curr = next;
    }

    list.headNode = prev;

  }
  
}
