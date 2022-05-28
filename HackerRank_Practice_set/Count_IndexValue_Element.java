package HackerRank_Practice_set;

import java.util.Scanner;

public class Count_IndexValue_Element
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        for (int i =0; i<arr.length;i++)
        {
            if (i == arr[i])
                ++count;
        }
        System.out.println(count);
    }
}
