package Arrays;

public class SinglyListInsertAtEnd <T> {
  
    public class Node{                // Create a Node Class
      public T data;
      public Node nextNode;
    }

    public int size;
    public Node headNode;

    public SinglyListInsertAtEnd(){   //constructor
      headNode = null;
      size = 0;
    }

    public boolean isEmpty(){         //Check empty  condition
      if(headNode == null) return true;
      return false;
    }

    public void insertAtHead(T data){  //Insert at the head first
      Node newNode = new Node();
      newNode.data = data;
      newNode.nextNode = headNode;
      headNode = newNode;
      size++;
    }

    public void insertAtEnd(T data){  //insert at the end of node
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
     
    public void printList(){        //Print the list
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
      SinglyListInsertAtEnd <Integer> s = new SinglyListInsertAtEnd<Integer>();
      s.printList();
      for(int i = 1 ; i<= 10; i++){
        s.insertAtEnd(i);
        s.printList();
      }
      
    }
  }
  
  

