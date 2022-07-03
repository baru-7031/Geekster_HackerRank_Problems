package HackerRank_Practice_set;

import java.util.Scanner;

public class Sum_of_Absolute_Differences
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++)
            arr[i] = sc.nextInt();

        for (int i =0; i<n; i++)
        {
            int sum =0;
            for (int j=0; j<n; j++)
            {
                sum += Math.abs((arr[i]-arr[j]));
            }
            System.out.println(sum + " ");
        }

    }
}
