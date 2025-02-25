import java.util.Scanner;
public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = scanner.nextInt();
        System.out.println("Palindrome numbers between " + lower + " and " + upper + ":");
        for (int number = lower; number <= upper; number++) {
            if (isPalindrome(number)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
