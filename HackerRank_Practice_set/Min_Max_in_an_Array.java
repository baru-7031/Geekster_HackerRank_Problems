package HackerRank_Practice_set;

import java.util.Scanner;

public class Min_Max_in_an_Array
{

    static int minINArray(int[] arr, int n)
    {
        int min = Integer.MAX_VALUE;

        for (int i =0;i<n;i++)
        {
            if (arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    static int maxINArray(int[] arr, int n)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n;i++)
        {
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        if (n < 2)
        {
            System.out.println(-1);
            return;
        }

        System.out.println(maxINArray(arr,n) - minINArray(arr, n));
    }
}
