package HackerRank_Practice_set;

import java.util.Scanner;

public class Factorial_sum_of_Digits
{
    static int fact(int n)
    {
        int f=1;
        for (int i =1; i<=n;i++)
        {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        while(0<n)
        {
            int temp = n%10;
            sum += fact(temp);
            n = n/10;
        }
        System.out.println(sum);
    }
}
