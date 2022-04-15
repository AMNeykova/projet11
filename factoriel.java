import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        long factorial = 1;
        do {
            factorial *= n;
            n--;
        } while (n > 0); // Check the loop condition
        System.out.println("n! = " + factorial);

    }
}
