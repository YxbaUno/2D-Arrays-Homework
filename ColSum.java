public class ColSum {
    public static void main(String[] args) {
        int val[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < val.length; i++ ) {
            int colSum = 0;
            for (int j = 0; j < val[i].length; j++ ) {
                colSum += val[j][i];
            }
            System.out.println("Column " + i + ": " + colSum);
        }
    }
}
