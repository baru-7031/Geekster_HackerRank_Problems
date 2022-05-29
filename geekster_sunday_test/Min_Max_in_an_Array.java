package geekster_sunday_test;

import java.util.Scanner;

public class Min_Max_in_an_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (2>N)
        {
            System.out.print(-1);
        }
        else
        {

            for (int i =0; i<arr.length;i++)
            {
               if (arr[i]>max)
                   max = arr[i];
               if (arr[i]<min)
                   min = arr[i];

            }
            System.out.print(max-min);
        }



    }
}
