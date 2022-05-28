package HackerRank_Practice_set;

import java.util.Scanner;

public class Peak_Elements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i<arr.length-1;i++)
        {
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
