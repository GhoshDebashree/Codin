package LinkedList;

public class SinglyListDeleteFromHead<T> {

  public class Node{
    public T data;
    public Node nextNode;
  }

  public int size;
  public Node headNode;

  public SinglyListDeleteFromHead(){
    size =0;
    headNode = null;
  }

  public boolean isEmpty(){
    if(headNode == null) return true;
    return false;
  }

  public void insertAtHead(T data){

    Node newNode = new Node();
    newNode.data= data;
    newNode.nextNode  = headNode;
    headNode = newNode;
    size++;
  }

  public void insertAtEnd(T data){

    if(isEmpty()){
      insertAtHead(data);
      return;
    }
    Node newNode = new Node();
    newNode.data= data;
    newNode.nextNode = null;

    Node last = headNode;
    while(last.nextNode != null){
      last = last.nextNode;
    }
    last.nextNode = newNode;
    size++;

  }

  public void insertAtPosition(T data , T previous){
    
    Node newNode = new Node();
    newNode.data= data;

    Node currentNode = headNode;
    while(currentNode != null && !currentNode.data.equals(previous)){
      currentNode = currentNode.nextNode;
      if(currentNode != null){
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
        size++;
      }
    }
  }

  public boolean searchList(T data){
     Node currentNode = headNode;
     while(currentNode != null){
       if(currentNode.data.equals(data)){
       return true;
        }
     currentNode = currentNode.nextNode;
      }
    return false;
    }


    public void deleteAtHead(){
      if(isEmpty())
        return;
      
      headNode = headNode.nextNode;
      size--;
    }
  
  public void printList(){
    if(isEmpty()){
      System.out.println("List is empty");
      return;
    }
    Node temp = headNode;
    System.out.print("List is : ");
    while(temp.nextNode != null){
      System.out.print(temp.data.toString()+ " - > ");
      temp = temp.nextNode; 
    }
    System.out.println(temp.data.toString()+ " - > null");
  } 
  public static void main(String [] args){
    SinglyListDeleteFromHead<Integer> s = new SinglyListDeleteFromHead<Integer>();
    for(int i = 1; i <=10; i++){
      s.insertAtEnd(i);
    }
   
    System.out.println("The list before deletion");
    s.printList();

    System.out.println("Delete data from head");
    s.deleteAtHead();
    s.printList();
    System.out.println("Delete data from head");
    s.deleteAtHead();
    s.printList();
  }
  






}
