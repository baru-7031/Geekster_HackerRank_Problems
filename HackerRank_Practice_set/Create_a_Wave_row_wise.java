package HackerRank_Practice_set;

import java.util.Scanner;

public class Create_a_Wave_row_wise
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i =0; i<m;i++)
        {
            for (int j =0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i =0; i<m;i++)
        {
            if (i%2==0)
            {
                for (int j =0;j<n;j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
            {
                for (int j = n-1;j>=0;j--)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
