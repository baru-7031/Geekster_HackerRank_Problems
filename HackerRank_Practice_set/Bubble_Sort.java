package HackerRank_Practice_set;

import java.util.Scanner;

public class Bubble_Sort
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

        for (int i = 0; i<arr.length;i++)
        {
            for (int j =0;j<arr.length-1-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int x : arr)
            System.out.print(x + " ");


    }
}
