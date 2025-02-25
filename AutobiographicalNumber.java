import java.util.*;
public class AutobiographicalNumber {
    public static int FindAutoCount(String n) {
        if (n == null) {
            return 0;
        }
        int[] count = new int[10];         
        for (char c : n.toCharArray()) {
            int digit = c - '0';
            count[digit]++;
        }
        for (int i = 0; i < n.length(); i++) {
            int expectedCount = n.charAt(i) - '0'; 
            if (count[i] != expectedCount) {
                return 0;  
            }
        }
        Set<Character> uniqueDigits = new HashSet<>();
        for (char c : n.toCharArray()) {
            uniqueDigits.add(c);
        }
        return uniqueDigits.size();
    }   
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        int result = FindAutoCount(input);
        System.out.println("Output: " + result);
    }
}
