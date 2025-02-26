import java.util.TreeSet;
public class ColorsTree {
  public static void main(String[] args) {
    TreeSet<String> treeSet = new TreeSet<String>();
    treeSet.add("Red");
    treeSet.add("Green");
    treeSet.add("Blue");
    System.out.println(treeSet);
    for (String color : treeSet) {
      System.out.println(color);
    }
    TreeSet<String> treeSet2 = new TreeSet<String>();
    treeSet2.add("Yellow");
    treeSet2.add("Orange");
    System.out.println(treeSet.addAll(treeSet2));
    System.out.println(treeSet);
    System.out.println(treeSet.ceiling("Green"));
    System.out.println(treeSet.pollFirst());
  }
}
