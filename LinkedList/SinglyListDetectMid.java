package LinkedList;

public class SinglyListDetectMid<T> {

  public class Node{
    public T data;
    public Node nextNode;
  }

  public int size;
  public Node headNode;

  public SinglyListDetectMid(){
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
    System.out.print("List is : ");
    while(temp.nextNode != null){
      System.out.print(temp.data.toString()+ " - > ");
      temp = temp.nextNode;
    }
    System.out.println(temp.data.toString()+ " - > null");

  }

  public static <T> Object detectMid(SinglyListDetectMid<T> list){              // We need tow pointers 'mid' and 'current' ,when current points the null the mid will point to the middle element.

    if (list.isEmpty())
            return null;
    
    SinglyListDetectMid<T>.Node mid = list.headNode;
    SinglyListDetectMid<T>.Node current = list.headNode;

    while(mid!=null && current!=null && current.nextNode!=null){
      current = current.nextNode.nextNode;
      if(current!= null){
        mid = mid.nextNode;
      }
    }
    return mid.data;
  }

  public static void main(String[] args) {
    SinglyListDetectMid<Integer> list = new SinglyListDetectMid<Integer>();
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    list.printList();
    System.out.println("Print element which it at the middle : " +detectMid(list));
    
  }

  
}
