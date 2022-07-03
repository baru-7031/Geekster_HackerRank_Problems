package HackerRank_Practice_set;

import java.util.Scanner;

public class Insertion_Sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n;i++)
        {
            int j = i-1;
            while(j>=0 && arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }

        for(int x : arr)
        {
            System.out.print(x + " ");
        }


    }
}
