package HackerRank_Practice_set;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;

public class Smallest_positive_missing_in_array
{
    static int findMissigElement(int[] arr)
    {
        int n = arr.length;
        int[] arr1 = new int[n];
        int j = 0;
//        for (int i =0;i<n-1;i++)
//        {
//            if (arr[i] != arr[i+1])
//
//        }

        if (arr[n-1]<0)
        {
            return 1;
        }
        else
        {
            for (int i =1; i<n;i++)
            {
                if (arr[i-1] != i)
                {
                    return i;
                }
            }
        }
        return n+1;
    }

    public static void main(String args[]) throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(findMissigElement(arr));


    }
}
