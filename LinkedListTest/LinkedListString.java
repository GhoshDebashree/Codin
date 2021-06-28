package LinkedListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class LinkedListString {
  public static void main(String args[]){
    LinkedList <String> llist = new LinkedList<>();
    llist.add("hello");
    llist.add("world");
    llist.addLast("It's a new world");
    System.out.println(llist);
    List <String> list = new ArrayList<>();
    list.add("10");
    list.add("20");
    llist.addAll(3,list);
    System.out.println(llist);
  }
  
}
