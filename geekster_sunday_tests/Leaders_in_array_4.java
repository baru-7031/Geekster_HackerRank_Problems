package geekster_sunday_test;

import java.util.Scanner;

public class Leaders_in_array_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            boolean isleader = true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    isleader=false;
                }
            }
            if(isleader)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[n-1]);

    }

}
