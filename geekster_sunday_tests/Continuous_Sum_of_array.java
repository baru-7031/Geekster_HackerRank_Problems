package geekster_sunday_test;

import java.util.Scanner;

public class Continuous_Sum_of_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] result = new int[N];


        for (int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i =0; i<arr.length;i++)
        {
            int sum =0;
            for (int j = 0; j<i+1;j++)
            {
                sum += arr[j];
            }
            result[i] = sum;
        }

        for (int x : result)
            System.out.print(x + " ");

    }
}
