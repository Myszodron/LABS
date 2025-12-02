import java.util.Arrays;

public class week6 {
    public static void main(String[] args) {

        int rows = 3;
        int columns = 6;

//Exercise 1
        int[][] T = makeTable(rows, columns);
        System.out.println("Table T:");
        print2D(T);

//Exercise 2
        System.out.println("Transpose:");
        print2D(transpose(T));

//Exercise 3
        int[][] TT = transpose(T);
        System.out.println("T * transpose(T):");
        print2D(multiply(T, TT));

//Exercise 4
        System.out.println("Rotate 90°:");
        int[][] R = rotate90(T);
        if (R.length == 0)
            System.out.println("Rotation only works for square matrices.\n");
        else
            print2D(R);

//Exercise 5
        System.out.println("Spiral:");
        print1D(spiral(T));

//Exercise 6
        System.out.println("Magic?");
        System.out.println(isMagic(T));
        System.out.println();

//Exercise 7
        System.out.println("Local maxima:");
        print2D(localMaxima(T));

//Exercise 8
        System.out.println("Jagged array:");
        print2D(jagged());

//Exercise 9
        System.out.println("Common elements in T:");
        int[] C = commonElements(T);

        if (C.length == 0)
            System.out.println("No common elements.\n");
        else
            print1D(C);
    }

    private static void print2D(int[][] a) {
        for (int[] row : a) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
        System.out.println();
    }

    private static void print1D(int[] a) {
        for (int x : a)
            System.out.print(x + " ");
        System.out.println("\n");
    }

    private static boolean isSquare(int[][] a) {
        return a.length == a[0].length;
    }

    //E1
    private static int[][] makeTable(int m, int n) {
        int[][] t = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                t[i][j] = (int) (Math.random() * 100) + 1;
        return t;
    }

    //E2
    private static int[][] transpose(int[][] a) {
        int m = a.length, n = a[0].length;
        int[][] t = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                t[i][j] = a[j][i];
        return t;
    }

    //E3
    private static int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int n2 = B.length;
        int p = B[0].length;

        if (n != n2)
            return new int[0][0];

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++)
                    sum += A[i][k] * B[k][j];
                C[i][j] = sum;
            }
        return C;
    }

    //E4
    private static int[][] rotate90(int[][] a) {
        if (!isSquare(a))
            return new int[0][0];

        int n = a.length;
        int[][] r = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                r[j][n - 1 - i] = a[i][j];

        return r;
    }

    //E5
    private static int[] spiral(int[][] a) {

        int m = a.length;
        int n = a[0].length;

        int[] out = new int[m * n];
        int idx = 0;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            //L->R
            for (int j = left; j <= right; j++)
                out[idx++] = a[top][j];
            top++;
            //T->B
            for (int i = top; i <= bottom; i++)
                out[idx++] = a[i][right];
            right--;
            //R->L
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    out[idx++] = a[bottom][j];
                bottom--;
            }
            //B->T
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    out[idx++] = a[i][left];
                left++;
            }
        }
        return out;
    }

    //E6
    private static boolean isMagic(int[][] a) {

        int n = a.length;
        if (n != a[0].length)
            return false;

        //target = sum of 1st row
        int target = 0;
        for (int j = 0; j < n; j++)
            target += a[0][j];

        int diagonal1 = 0, diagonal2 = 0;

        for (int i = 0; i < n; i++) {

            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += a[i][j];
                colSum += a[j][i];
            }
            if (rowSum != target || colSum != target)
                return false;

            diagonal1 += a[i][i];
            diagonal2 += a[i][n - 1 - i];
        }
        return diagonal1 == target && diagonal2 == target;
    }

    //E7
    private static int[][] localMaxima(int[][] a) {
        int m = a.length;
        int n = a[0].length;

        int[][] temp = new int[(m - 2) * (n - 2)][3];
        int count = 0;

        for (int i = 1; i < m - 1; i++)
            for (int j = 1; j < n - 1; j++) {

                int x = a[i][j];

                if (x > a[i - 1][j] &&
                        x > a[i + 1][j] &&
                        x > a[i][j - 1] &&
                        x > a[i][j + 1]) {

                    temp[count][0] = i;
                    temp[count][1] = j;
                    temp[count][2] = x;
                    count++;

                }

            }
        return Arrays.copyOf(temp, count);
    }

    //E8
    private static int[][] jagged() {

        int[] rowSize = {3, 5, 2, 1};

        int[][] jagged = new int[rowSize.length][];

        int value = 1;
        for (int i = 0; i < rowSize.length; i++) {
            jagged[i] = new int[rowSize[i]];
            for (int j = 0; j < rowSize[i]; j++) {
                jagged[i][j] = value++;
            }
        }
        return jagged;
    }

    //E9
    private static int[] commonElements(int[][] a) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] row : a)
            for (int x : row) {
                if (x < min) min = x;
                if (x > max) max = x;
            }

        int[] temp = new int[max - min + 1];
        int idx = 0;

        for (int k = min; k <= max; k++) {

            boolean inAllRow = true;

            for (int i = 0; i < a.length; i++) {
                boolean found = false;

                for (int x : a[i]) {
                    if (x == k) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    inAllRow = false;
                    break;
                }
            }
            if (inAllRow) {
                temp[idx++] = k;
            }
        }
        return Arrays.copyOf(temp, idx);
    }
}
