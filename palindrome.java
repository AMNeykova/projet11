import java.util.Scanner;

public class palindrome {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String original, reverse = "";
        System.out.println("Enter a string or number to check if it is a palindrome");
        original = scanner.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string or number is a palindrome.");
        else
            System.out.println("Entered string or number isn't a palindrome.");
    }
}
