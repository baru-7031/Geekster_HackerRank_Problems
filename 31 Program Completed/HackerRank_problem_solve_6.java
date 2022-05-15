package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_6
{
    public static void main(String[] args)
    {
        // Take two integers as input value.
        //
        //Print greater among them as output.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b)
            System.out.println(b);
        else
            System.out.println(a);

    }
}
