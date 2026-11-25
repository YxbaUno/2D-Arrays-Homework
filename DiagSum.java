public class DiagSum {
    public static void main(String[] args) {
        int val[][] = {
                {13, 322, 133},
                {443, 78, 656},
                {78, 656, 921}
        };
        int sum = 0;
        for (int i = 0; i < val.length; i++) {
            sum += val[i][i];
            }
        System.out.println("Summary for diafonal is " + sum);
        }
}
