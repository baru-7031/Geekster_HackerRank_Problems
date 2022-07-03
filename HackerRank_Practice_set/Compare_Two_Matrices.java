package HackerRank_Practice_set;

import java.util.Scanner;

public class Compare_Two_Matrices
{

    static String checking(int[][] arr1, int m1, int n1, int[][] arr2,int m2,int n2)
    {
        if (m1 != m2 || n1 != n2)
        {
            return "Not Same";
        }

        for (int i =0; i<m1;i++)
        {
            for (int j=0; j<n1;j++)
            {
                if (arr1[i][j] != arr2[i][j])
                {
                    return "Not Same";
                }
            }
        }
        return "Same";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int [][] arr1 = new int[m1][n1];
        for (int i =0; i<m1;i++)
        {
            for (int j =0;j<n1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] arr2 = new int[m2][n2];

        for (int i =0; i<m2;i++)
        {
            for (int j =0; j<n2;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println(checking(arr1,m1,n1,arr2,m2,n2));

    }
}
