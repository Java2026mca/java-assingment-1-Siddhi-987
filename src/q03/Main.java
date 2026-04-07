import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int val = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) matrix[top][i] = val++;
            top++;

            for (int i = top; i <= bottom; i++) matrix[i][right] = val++;
            right--;

            for (int i = right; i >= left; i--) matrix[bottom][i] = val++;
            bottom--;

            for (int i = bottom; i >= top; i--) matrix[i][left] = val++;
            left++;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }

        if (n % 2 == 1)
            sum -= matrix[n / 2][n / 2];

        System.out.println("Diagonal Sum: " + sum);
    }
}
        //
        // Input: 3
        // Output:
        // 1 2 3
        // 8 9 4
        // 7 6 5
        // Diagonal: 25

    }
}
