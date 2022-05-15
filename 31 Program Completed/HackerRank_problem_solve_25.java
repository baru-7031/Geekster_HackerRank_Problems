package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i<num;i++)
        {
            for (int k = 0; k<i; k++)
                System.out.print(" ");
            for (int j = 0; j<=num-i-1;j++)
                System.out.print(" *");
            System.out.println();
        }

    }
}
