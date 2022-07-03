package HackerRank_Practice_set;

import java.util.Scanner;

public class Multiplication_of_two_Matrices
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();

        int[][] arr1 = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int m2 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] arr2 = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        if (m1 != n2)
        {
            System.out.println(-1);
            return;
        }

        int[][] arr3 = new int[m1][n2];
        for (int i =0; i<m1; i++)
        {
            for (int k=0; k<m1;k++)
            {
                int sum =0;
                for (int j =0; j<n1;j++)
                {
                    sum += arr1[k][j] * arr2[j][i];
                }
                arr3[k][i] = sum;
            }

        }

        for (int i=0; i<m1;i++)
        {
            for (int j =0; j<n2;j++)
            {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
