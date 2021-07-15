package Trees;

public class BinarySearchTree {


class Node{                                     //Create a Node class,which consistes of data, left and right node.
  private int data;
  private Node leftChildNode;
  private Node rightChildNode;

  Node(int value){                            //constructor calling.
    this.data = value;
    leftChildNode = null;
    rightChildNode = null;
  }

  public int getData(){                       //getter and setter methods !!
    return data;
  }

  public void setData(int value){
    this.data = value;
  }

  public Node getLeftChild(){
    return leftChildNode;
  }
  public Node getRightChild(){
    return rightChildNode;
  }
  public void setLeftChild(Node left){
    this.leftChildNode = left;
  }
  public void setRightChild(Node right){
    this.rightChildNode = right;
  }


}
public Node root;                                   

public Node getRoot(){
  return root;
}

public void setRoot(Node root){                           
  this.root = root;
}

public boolean addAtBST(int value){                                       //Enter the values .
  if(isEmpty()){
    root = new Node(value);
    return true;
  }
  Node currentNode = root;                                                  //if the left node is less than the root ,set the left node
  while(currentNode!= null){
    Node left = currentNode.getLeftChild();
    Node right = currentNode.getRightChild();
    if(currentNode.getData() > value){
      if(left==null){
      left = new Node(value);
      currentNode.setLeftChild(left);
      return true;
      }
    currentNode = left;
    }
  else if(currentNode.getData() < value){                                 //else set the node to the right ,which should be greater than root.
    if(right == null){
    right = new Node(value);
    currentNode.setRightChild(right);
    return true;
      }
  currentNode = right;
    }
  }
return false;

}

public boolean isEmpty(){
  return root == null;
}

public void printTree(Node current){                                //Print the Tree.
  if(current == null) return;
  System.out.print(current.getData()+ " , ");
  printTree(current.getLeftChild());
  printTree(current.getRightChild());
}

public static void main(String[] args) {
  BinarySearchTree bsT = new BinarySearchTree();
    bsT.addAtBST(6);
		bsT.addAtBST(4);
		bsT.addAtBST(9);
		bsT.addAtBST(5);
		bsT.addAtBST(2);
		bsT.addAtBST(8);
		bsT.addAtBST(12);
		bsT.addAtBST(10);
		bsT.addAtBST(14);

    bsT.printTree(bsT.getRoot());
  
  }
}
