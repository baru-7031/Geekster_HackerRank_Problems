package HackerRank_Practice_set;

import java.util.Scanner;

public class Search_Element
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
        int x = sc.nextInt();
        int result =0;
        for (int i = 0; i<arr.length;i++)
        {
            if (x == arr[i])
            {
                result = i;
                break;
            }
            else
            {
                result = -1;
            }
        }
        System.out.println(result);

    }
}
