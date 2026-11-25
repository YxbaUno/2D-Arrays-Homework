public class MinMax {
    public static void main(String[] args) {
        int[][] a = {
                {5, 10, 15, 11},
                {51, 199, 1, 303},
                {20, 25, 30, 100000}
        };
        int max = 0;
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Maximux: " + max);
        System.out.println("Minimum: " + min);
    }
}
