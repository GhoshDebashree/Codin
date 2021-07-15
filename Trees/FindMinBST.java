package Trees;

public class FindMinBST {


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
    this.data = value;
  }
  public Node getLeftChildNode(){
    return leftChildNode;
  }
  public Node getrightChildNode(){
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

  public boolean addAtBST(int value){
    if(isEmpty()){
      root = new Node(value);
      return true;
    }
  Node curreNode = root;
  while(curreNode!= null){
    Node left = curreNode.getLeftChildNode();
    Node right = curreNode.getrightChildNode();
    if(curreNode.getData() > value){
      if(left == null){
        left = new Node(value);
        curreNode.setLeftChild(left);
        return true;
      }
    curreNode = left;
    }
  else if(curreNode.getData() < value){
    if(right == null){
      right = new Node(value);
      curreNode.setRightChild(right);
      return true;
      }
    curreNode = right;
    }
  }
  return false;
}


public boolean isEmpty(){
  return root == null;
}

public void printTree(Node current){
  if(current == null) return;
  System.out.print(current.getData()+ " , ");
  printTree(current.getLeftChildNode());
  printTree(current.getrightChildNode());
}
 
public static int getMin(Node root){                                // To find the minimum in a BST, we have to the the node in the left subtree.As in BST the left Node is the smallest.
  if(root == null) return -1;
   while(root.getLeftChildNode() != null){
     root = root.getLeftChildNode();
   }
     return root.getData();
 }
  
  
public static void main(String[] args) {
  FindMinBST bsT = new FindMinBST();
    bsT.addAtBST(6);
		bsT.addAtBST(4);
		bsT.addAtBST(9);
		bsT.addAtBST(5);
		bsT.addAtBST(2);
		bsT.addAtBST(8);
		bsT.addAtBST(12);
		bsT.addAtBST(10);
		bsT.addAtBST(14);

    System.out.println(getMin(bsT.getRoot()));
  }

}
