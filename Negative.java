import java.util.Arrays;
public class Negative {
    public static void main(String[] args) {
        int val[][] = {
                {-13, 322, 133},
                {443, -78, 656},
                {78, -656, 921}
        };
        System.out.println("Original Array: ");
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                System.out.print(val[i][j] + " ");
            }

            System.out.println();
        }
            for (int i = 0; i < val.length; i++) {
                for (int j = 0; j < val[i].length; j++) {
                    if (val[i][j] < 0) {
                        val[i][j] = 0;
                    }
                }
            }
            System.out.println("Modified Array: ");
        for (int i = 0; i < val.length; i++) {
        for (int j = 0; j < val[i].length; j++) {
            System.out.print(val[i][j] + " ");
        }
        System.out.println();
        }
    }
}
