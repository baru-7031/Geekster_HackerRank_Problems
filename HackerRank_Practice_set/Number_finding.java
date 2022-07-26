package HackerRank_Practice_set;

import java.util.Arrays;
import java.util.Scanner;

public class Number_finding
{
    static int numFind2(int n,int[] arr,int x)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]%x==0)
            {
                if(max<arr[i])
                    max=arr[i];
            }
        }
        if(max==Integer.MIN_VALUE)
        {
            return -1;
        }
        return max;
    }



    static int numFind(int[] arr, int n, int k)
    {
        int num=0;
        Arrays.sort(arr);
        for (int i =0; i<n; i++)
        {
            if (arr[i]%k == 0)
            {
                num = arr[i];
            }
        }
        if (num != 0)
            return num;
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();

        System.out.println(numFind(arr,n,k));

    }
}
