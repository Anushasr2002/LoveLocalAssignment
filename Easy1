import java.util.*;

public class WordLength {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int last = s.lastIndexOf(' ');
        if (last == -1) {
            return s.length();
        }
        return s.substring(last + 1).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();  
        System.out.println(lengthOfLastWord(s));
        sc.close();
    }
}
