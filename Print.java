public class Print {

    static void printArrays(char[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = '*';
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i < j) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i > j) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i >= j) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i <= j) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = x.length - 1; j >= 0; j--) {
                if (j == i) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = x.length - 1; j >= 0; j--) {
                if (j < i) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = x.length - 1; j >= 0; j--) {
                if (j <= i) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j <x.length; j++) {
                if (j != x.length - 2) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == 0 || j == 0 || i == x.length - 1 || j == x.length - 1) {
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (!(i == 0 || j == 0 || i == x.length - 1 || j == x.length - 1)){
                    x[i][j] = '*';
                    System.out.print(x[i][j]);
                } else {
                    x[i][j] = ' ';
                    System.out.print(x[i][j]);
                }
            }
            System.out.println();
        }
    }
}
