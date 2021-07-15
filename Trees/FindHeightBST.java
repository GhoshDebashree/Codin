package Trees;

public class FindHeightBST {

public class Node{
  private int data;
  private Node leftChildNode;
  private Node rightChildNode;

  Node(int value){
    this.data = value;
    leftChildNode = null;
    rightChildNode = null;

  }
  public int getData(){
    return data;
  }
  public void setData(int value){
    this.data =value;
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
public void setRightchild(Node right){
  this.rightChildNode = right;
}
}

public Node root;
public Node getRoot(){
  return root;
}
public void setRoot(Node root){
  this.root =root;
}

public boolean addAtBST(int value ){
  if(isEmpty()){
    root = new Node(value);
    return true;
  }
  Node currentNode = root;
  while(currentNode!=null){
    Node left = currentNode.getLeftChild();
    Node right = currentNode.getRightChild();
    if(currentNode.getData() > value){
      if(left == null){
        left = new Node(value);
        currentNode.setLeftChild(left);
        return true;
      }
      currentNode = left;
    }
    else if(currentNode.getData() < value){
      if(right == null){
        right = new Node(value);
        currentNode.setRightchild(right);
        return true;
      }
    }
    currentNode = right;
  }
  return false;
}

public boolean isEmpty(){
  return root == null;
}

public static int getHeight(Node root){                             // //to Find the height of the BST ,we have to find the greater in left or right subtree.
  if(root == null) return -1;
  else{
    return 1 + Math.max(getHeight(root.getLeftChild()),getHeight(root.getRightChild()));
  }
}

public void printTree(Node current){
  if(current == null) return;
  System.out.print(current.getData()+ " , ");
  printTree(current.getLeftChild());
  printTree(current.getRightChild());
}

public static void main(String[] args) {
  FindHeightBST bsT = new FindHeightBST();
  bsT.addAtBST(6);
  bsT.addAtBST(4);
  bsT.addAtBST(9);
  bsT.addAtBST(5);
  bsT.addAtBST(2);
  bsT.addAtBST(8);
  bsT.addAtBST(12);
  bsT.addAtBST(10);
  bsT.addAtBST(14);

  System.out.println(getHeight(bsT.getRoot()));
  
  }
}



  

