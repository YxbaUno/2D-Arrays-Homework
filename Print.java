public class Print {
    public static void main(String[] args) {
        int[][] a = {
                {12, 14, 16},
                {55, 22, 99},
                {11, 33, 44}
        };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[0][i] + " ");
        }
        System.out.println( );
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[1][i] + " ");
        }
        System.out.println( );
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[2][i] + " ");
        }
    }
}
