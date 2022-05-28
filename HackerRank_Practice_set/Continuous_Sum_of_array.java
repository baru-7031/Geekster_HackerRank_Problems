package HackerRank_Practice_set;

import java.util.Scanner;

public class Continuous_Sum_of_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i<arr1.length;i++)
        {
            int sum =0;
            for (int j = 0; j<i+1;j++)
            {
                sum += arr1[j];
            }
            arr2[i] = sum;
        }
        for (int x : arr2)
            System.out.print(x + " ");



    }
}
