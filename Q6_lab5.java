import java.util.Scanner;

class Main 
{
        public static void main(String[] args) 
        {
            int[][] matrix = new int[3][3];
            Scanner scanner = new Scanner(System.in);

            // get user input for matrix values
            System.out.println("Enter the matrix values:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

        // calculate sum of left diagonal
            int leftSum = 0;
            for (int i = 0; i < 3; i++) {
                leftSum += matrix[i][i];
            }

            // calculate sum of right diagonal
            int rightSum = 0;
            for (int i = 0; i < 3; i++) {
                rightSum += matrix[i][2-i];
            }

            // print results
            System.out.println("Sum of left diagonal: " + leftSum);
            System.out.println("Sum of right diagonal: " + rightSum);
    }
}

