package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        while(i<=num)
        {
            if (num%i==0)
                break;
            i++;
        }
        if (i == num)
            System.out.println("Prime");
        else
            System.out.println("Not a Prime");

    }
}
