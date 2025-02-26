import java.util.ArrayList;
public class ColorsArray {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    System.out.println(colors);
    for (String color : colors) {
      System.out.println(color);
    }
    System.out.println(colors.get(1));
    ArrayList<String> copyColors = new ArrayList<String>(colors);
    System.out.println(copyColors);
    ArrayList<String> moreColors = new ArrayList<String>();
    moreColors.add("Yellow");
    moreColors.add("Orange");
    moreColors.addAll(colors);
    System.out.println(moreColors);
  }
}
