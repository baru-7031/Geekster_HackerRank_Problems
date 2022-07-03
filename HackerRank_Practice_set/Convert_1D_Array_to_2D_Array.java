package HackerRank_Practice_set;

import java.util.Scanner;

public class Convert_1D_Array_to_2D_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1D = new int[n];
        for (int i =0; i<n;i++)
        {
            arr1D[i] = sc.nextInt();
        }

        int index =0;
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr2D = new int[p][q];
        for (int i =0; i<p;i++)
        {
            for (int j =0; j<q; j++)
            {
                arr2D[i][j] = arr1D[index++];
            }
        }

        for (int i =0; i<p; i++)
        {
            for (int j =0; j<q; j++)
            {
                System.out.println(arr2D[i][j]);
            }
        }


    }
}
