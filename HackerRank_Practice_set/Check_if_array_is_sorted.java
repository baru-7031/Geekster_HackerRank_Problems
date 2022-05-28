package HackerRank_Practice_set;

import java.util.Scanner;

public class Check_if_array_is_sorted
{
    static String check(int[] Arr)
    {
        for (int i=0; i<Arr.length-1;i++)
        {
            if (Arr[i]>Arr[i+1])
            {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Arr = new int[N];

        for (int i =0; i<Arr.length;i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println(check(Arr));
        sc.close();
    }
}
