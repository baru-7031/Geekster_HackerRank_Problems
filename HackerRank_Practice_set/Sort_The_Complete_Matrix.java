package HackerRank_Practice_set;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_The_Complete_Matrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i =0; i<m; i++)
        {
            for (int j =0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int index = 0;
        int[] store = new int[m*n];
        for (int i =0; i<m; i++)
        {
            for (int j =0; j<n; j++)
            {
                store[index++] = arr[i][j];
            }
        }
        Arrays.sort(store);

        index =0;
        for (int i =0; i<m; i++)
        {
            for (int j =0; j<n; j++)
            {
                arr[i][j] = store[index++];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
