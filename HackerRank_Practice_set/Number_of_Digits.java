package HackerRank_Practice_set;

import java.util.Scanner;

public class Number_of_Digits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        while(0<N)
        {
            N = N/10;
            ++count;
        }
        System.out.print(count);

    }
}
