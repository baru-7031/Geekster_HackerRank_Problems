package HackerRank_Practice_set;

import java.util.Scanner;

public class All_Zeroes_at_Right
{

    static int[] allZeroRight(int[] arr, int n)
    {
        int[] receive = new int[n];
        int count =0;
        for (int i =0; i<n; i++)
        {
            if (arr[i] != 0)
                receive[count++] = arr[i];
        }
        for (int i=0; i<n; i++)
        {
            if (arr[i] == 0)
                receive[count++] = arr[i];
        }

        return receive;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        arr = allZeroRight(arr,n);

        for (int i =0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
