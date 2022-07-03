package HackerRank_Practice_set;

import java.util.Scanner;

public class Add_Two_Matrices
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();

        int[][] arr1 = new int[m1][n1];
        for (int i =0; i<m1;i++)
        {
            for (int j =0; j<n1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] arr2 = new int[m1][n1];
        for (int i =0; i<m2;i++)
        {
            for (int j =0; j<n2;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] arr3 = new int[m1][n1];
        if (m1 == m2 && n1 == n2 && 1<=m1 && 1<=m2 && 1<=n1 && 1<=n2)
        {
            for (int i =0; i<m1;i++)
            {
                for (int j =0; j<n1;j++)
                {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            for (int i =0; i<m1;i++)
            {
                for (int j =0; j<n1;j++)
                {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println(-1);

    }
}
