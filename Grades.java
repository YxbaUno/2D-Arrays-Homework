public class Grades {
    public static void main(String[] args) {
        int max = 0;
        int val[][] = {
            {60, 55, 89, 69},
            {100, 78, 98, 81},
            {58, 73, 86, 100}
        };
        int totalSum = 0;
        for (int i = 0; i < val.length; i++) {
            int sum = 0;
            for (int j = 0; j < val[i].length; j++) {
                if (val[i][j] > max) {
                    max = val[i][j];
                }
                sum += val[i][j];
                totalSum += val[i][j];
            }
            double average = (double) sum / val[i].length;
            System.out.println("Student " + (i + 1) + " Average: " + average);
        }
        double totalAverage = (double) totalSum / (val.length * val[0].length);
        System.out.println("Maximum score is: " + max);
        System.out.println("Overall average is: " + totalAverage);
    }
}
