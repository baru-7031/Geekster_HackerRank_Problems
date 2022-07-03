package HackerRank_Practice_set;

import java.util.Scanner;

public class Diagonal_Sum
{

    static int diagoSum(int[][] arr, int n)
    {
        int sum =0;
        for(int i =0; i<n; i++)
        {
            sum += arr[i][i];
            arr[i][i] = -1;
        }
        int rev = n-1;
        for (int i =0; i<n; i++)
        {
            if (arr[i][rev] != -1)
            {
                sum += arr[i][rev];
            }
            rev--;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i =0; i<n; i++)
        {
            for (int j =0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(diagoSum(arr,n));

    }
}
