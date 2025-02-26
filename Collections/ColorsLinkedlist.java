import java.util.LinkedList;
import java.util.Collections;
public class ColorsLinkedlist {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("Red");
    linkedList.add("Green");
    linkedList.add("Blue");
    System.out.println(linkedList);
    for (String color : linkedList) {
      System.out.println(color);
    }
    for (int i = linkedList.size() - 1; i >= 0; i--) {
      System.out.println(linkedList.get(i));
    }
    System.out.println(linkedList.indexOf("Green"));
    System.out.println(linkedList.lastIndexOf("Green"));
    Collections.shuffle(linkedList);
    System.out.println(linkedList);
  }
}
