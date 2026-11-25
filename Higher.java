import java.util.Scanner;
public class Higher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int val[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int have = 0;
        for (int i = 0; i < val.length; i++ ) {
            for (int j = 0; j < val[i].length; j++ ) {
                if (num < val[i][j]) {
                    have++;
                }
            }
            if (have == 0) {
                System.out.println("Dont have any matrix higher than entered number");
            } else {
                System.out.println("We have " + have + " numbers higher than entered");
            }

        }
    }
}
