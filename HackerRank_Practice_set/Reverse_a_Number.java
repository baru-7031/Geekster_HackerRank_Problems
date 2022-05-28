package HackerRank_Practice_set;

import java.util.Scanner;

public class Reverse_a_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = 0;
        while(0<N)
        {
            int last = N%10;
            reverse = (reverse*10)+last;
            N=N/10;
        }

        System.out.println(reverse);

    }
}
