import java.util.HashSet;
public class ColorsHash {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("Red");
    hashSet.add("Green");
    hashSet.add("Blue");
    System.out.println(hashSet);
    for (String color : hashSet) {
      System.out.println(color);
    }
    String[] array = new String[hashSet.size()];
    hashSet.toArray(array);
    for (String color : array) {
      System.out.println(color);
    }
    HashSet<String> hashSet2 = new HashSet<String>();
    hashSet2.add("Red");
    hashSet2.add("Green");
    System.out.println(hashSet.retainAll(hashSet2));
    System.out.println(hashSet);
    hashSet.clear();
    System.out.println(hashSet);
  }
}
