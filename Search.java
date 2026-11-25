public class Search {
    public static void main(String[] args) {
        int val[][] = {
                {13, 322, 133},
                {443, 78, 656},
                {78, 656, 921}
        };
        int have = 0;
        int row = 0;
        int col = 0;
        int found = 0;
        for (int i = 0; i < val.length; i++ ) {
            for (int j = 0; j < val[i].length; j++ ) {
                for (int l = i; l < val.length; l++) {
                    int start = (l == i) ? j + 1 : 0;
                    for (int t = start; t < val[l].length; t++) {
                        if (val[i][j] == val[l][t]) {
                            have++;
                            found++;
                            System.out.println(val[i][j] + " is found at [" + i + "][" + j + "] and at [" + l + "][" + t + "]");
                        }
                    }
                }
            }
        }
        System.out.println("We have " + have + " matching elements");
        if (found == 0) {
            System.out.println("Not found");
        }
    }
}
