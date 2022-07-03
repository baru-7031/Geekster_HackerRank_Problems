package HackerRank_Practice_set;

import java.util.Scanner;

public class Milk_and_Water
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr1 = new int[N];


        for (int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int j=0;
        for (int i =0; i<N;i++)
        {
            if (arr[i]<0)
            {
                arr1[j] = arr[i];
                j++;
            }
        }

        for (int i =0; i<N;i++)
        {
            if (arr[i]>0)
            {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int x : arr1)
            System.out.print(x + " ");


    }
}
