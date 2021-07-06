package LinkedList;

public class SinglyListInsertAtPosition<T> {
  public class Node{                            //Create Node class
    public T data;
    public Node nextNode;
  }

  public int size;                               //declare the data and the address of the head node
  public Node headNode;

  public SinglyListInsertAtPosition(){
        size  = 0;
        headNode = null;
  }

  public boolean isEmpty(){                     //Write the isEmpty function .
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

  public void insertInPosition(T data, T previous){
    Node newNode = new Node();
    newNode.data = data;

    
    Node currentNode = this.headNode;
    while(currentNode != null && !currentNode.data.equals(previous)){
      currentNode = currentNode.nextNode;
    }
    if(currentNode != null){
      newNode.nextNode =currentNode.nextNode;
      currentNode.nextNode = newNode;
      size++;
    }
  }

  public void printList(){
    if(isEmpty()){
      System.out.println("List is empty ");
      return;
    }
    Node temp = headNode;
    System.out.println("List : ");
    while(temp.nextNode != null){
      System.out.print(temp.data.toString()+ " - > " );
      temp = temp.nextNode;
    }
    System.out.print(temp.data.toString()+ " - > null" );
  }

  public static void main(String[] args) {
    SinglyListInsertAtPosition <Integer> s = new SinglyListInsertAtPosition<Integer>();
    
    for(int i = 1 ; i<= 6; i++){
      s.insertAtEnd(i);
      }
        s.printList();
        System.out.println ("\nInserting 8 after 2");
        s.insertInPosition(8, 2);
        s.printList();   // calling insert after
        System.out.println ("\nInserting 10 after 3");
        s.insertInPosition (10, 3);   // calling insert after
        s.printList();
    }
    
  }





