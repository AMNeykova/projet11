import java.util.Scanner;

public class sumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (num >= 0 && num <= 100) {
            num = scanner.nextInt();
            sum = num+num;
            System.out.println(sum);
        } System.out.println("Invalid");
    }
}