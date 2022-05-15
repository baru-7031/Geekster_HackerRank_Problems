package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i<=num;i++)
        {
            if (i%7==0)
                System.out.print(i + " ");
        }


    }
}
