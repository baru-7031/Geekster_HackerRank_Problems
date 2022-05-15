package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++)
        {
            if (i%3==0 || i%5==0)
                System.out.print(i + " ");
        }

    }
}
