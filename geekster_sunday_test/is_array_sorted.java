package geekster_sunday_test;

import java.util.Scanner;

public class is_array_sorted
{
    static String isArraySorted(int[] arr)
    {
        for (int i =0; i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
                return "False";
        }
        return "True";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i =0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(isArraySorted(arr));

    }
}
