import java.util.Scanner;

public class printTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int j;
        System.out.println("Enter Rows: ");
        num=scanner.nextInt();

        for (int i = 0; i<= num; i++) {

            for (j = 1; j <= num - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
            for (int k = num; k >= j - 1; k--) {
                System.out.print(" ");
            }

        }
    }
}
