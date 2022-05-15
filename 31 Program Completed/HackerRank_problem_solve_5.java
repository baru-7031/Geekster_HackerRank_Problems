package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_5
{
    public static void main(String[] args)
    {
        // check inputs is Square Or Not.

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        if (l == b)
            System.out.println("Square");
        else
            System.out.println("Not a Square");
    }
}
