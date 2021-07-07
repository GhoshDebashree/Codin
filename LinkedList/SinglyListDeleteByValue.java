package LinkedList;

public class SinglyListDeleteByValue<T> {

  public class Node{
    public Node nextNode;
    public T data;
}

public int size;
public Node headNode;

public SinglyListDeleteByValue(){
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
  newNode.nextNode = null;
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

public void insertAtPosition(T data, T previous){
  Node newNode = new Node();
  newNode.data = data;

  Node currentNode = headNode;
  while(currentNode != null && !currentNode.data.equals(previous)){
    currentNode = currentNode.nextNode;
    if(currentNode!=null)
    {
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
  if(isEmpty()){
    System.out.println("empty");

  }
  headNode = headNode.nextNode;
  size--;
}

public void deleteFromPosition(T data){

  Node currentNode = headNode;
  Node previous  = null;

  if(currentNode.data.equals(data)){
    deleteAtHead();
    return;
  }
  while(currentNode!= null){
    if(data.equals(currentNode.data)){
      previous.nextNode = currentNode.nextNode;
      size--;
      return;
    }
    previous = currentNode;
    currentNode = currentNode.nextNode;

  }
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
    temp = temp.nextNode;
  }
  System.out.println(temp.data.toString()+ " - > null");
  }


public static void main(String[] args) {
  SinglyListDeleteByValue <Integer> s = new SinglyListDeleteByValue<Integer>();
  for(int i = 1; i<= 10;i++){
    s.insertAtEnd(i);
  }
  s.printList();;
  s.deleteFromPosition(5);
  s.printList();
  
 
  s.deleteFromPosition(11);
  s.printList();
}
  
}
