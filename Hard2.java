import java.util.Scanner;

public class ShortestPalindrome {

    public static String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] kmpTable = new int[combined.length()];
        for (int i = 1; i < combined.length(); i++) {
            int j = kmpTable[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = kmpTable[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            kmpTable[i] = j;
        }
        int overlap = kmpTable[combined.length() - 1];
        return rev.substring(0, n - overlap) + s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String result = shortestPalindrome(input);

        System.out.println("Shortest palindrome: " + result);
        scanner.close();
    }
}
