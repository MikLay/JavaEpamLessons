package ua.company;

class Fibonacci {

    static int fibMatrix(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Wrong number");
        }

        if (n == 0)
            return 0;
        int[][] F = new int[][]{{1, 1}, {1, 0}};
        powerMatrix(F, n - 1);

        return F[0][0];
    }

    private static void multiplyMatrix(int[][] F, int[][] M) {
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    private static void powerMatrix(int[][] F, int n) {
        int i;
        int[][] M = new int[][]{{1, 1}, {1, 0}};

        for (i = 2; i <= n; i++)
            multiplyMatrix(F, M);
    }


    public static int fibRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Wrong number");
        }
        return fibR(n);
    }

    private static int fibR(int n) {
        if (n <= 1) {
            return n;
        }
        return fibR(n - 1) + fibR(n - 2);
    }

    // Storing C
    static int fibIter(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Wrong number");
        }
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


}
