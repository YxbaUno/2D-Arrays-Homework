import java.util.Scanner;
public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter value [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
