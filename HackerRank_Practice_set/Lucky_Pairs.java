package HackerRank_Practice_set;

import java.util.Scanner;

public class Lucky_Pairs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int count =0;
        for (int i =0; i<arr.length;i++)
            arr[i] = sc.nextInt();
        for (int i =0; i<arr.length;i++)
        {
            for (int j =0; j<arr.length;j++)
            {
                if (arr[i] == arr[j] && i<j)
                    ++count;
            }
        }
        System.out.println(count);


    }

}
