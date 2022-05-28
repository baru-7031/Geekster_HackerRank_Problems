package HackerRank_Practice_set;

import java.util.Scanner;

public class Count_Even_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int count =0;

        for (int x : arr)
        {
            if (x%2==0)
                ++count;
        }
        System.out.println(count);
    }
}
