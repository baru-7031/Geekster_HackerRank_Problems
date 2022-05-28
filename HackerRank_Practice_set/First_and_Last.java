package HackerRank_Practice_set;

import java.util.Scanner;

public class First_and_Last
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int check = sc.nextInt();
        int first = 0;
        int last =0;
        for (int i = 0; i<arr.length;i++)
        {
            if (check == arr[i])
            {
                first = i;
                break;
            }

        }
        for (int i =0; i<arr.length;i++)
        {
            if (check == arr[i])
            {
                last = i;
            }
        }
        System.out.println(first);
        System.out.println(last);

    }
}
