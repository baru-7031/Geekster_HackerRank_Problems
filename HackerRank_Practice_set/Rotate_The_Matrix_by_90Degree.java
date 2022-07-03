package HackerRank_Practice_set;

import java.util.Scanner;

public class Rotate_The_Matrix_by_90Degree
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i =0; i<n;i++)
        {
            for (int j =0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arrSave = new int[n][n];
        for (int i =0; i<n;i++)
        {
            int reve = n-1;
            for (int j =0; j<n; j++)
            {
                arrSave[i][j] = arr[reve--][i];
            }
        }

        for (int i =0; i<n;i++)
        {
            for (int j =0; j<n; j++)
            {
                System.out.print(arrSave[i][j] + " ");
            }
            System.out.println();
        }

    }
}
