package HackerRank_Practice_set;

import java.util.Scanner;

public class Search_an_Element_in_2_D_Matrix
{
    static String search(int[][] arr, int m, int n, int target)
    {
        for (int i =0; i<m;i++)
        {
            for (int j =0; j<n;j++)
            {
                if (target == arr[i][j])
                    return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i =0; i<m;i++)
        {
            for (int j=0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        System.out.println(search(arr,m,n,x));

    }
}
