package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 1;
        for (int i =0;i<num;i++)
        {

            for (int k=0;k<num-i-1;k++)
                System.out.print(" ");
            if (i != 0)
            {
                count += 2;
                for (int j = 0; j < count; j++)
                    System.out.print("*");
            }
            else
                System.out.print("*");
            System.out.println();
        }
        for (int i =0;i<num-1;i++)
        {

            for (int k=0;k<i+1;k++)
                System.out.print(" ");
            if (count != 1)
            {
                count -= 2;
                for (int j = 0; j < count; j++)
                    System.out.print("*");
            }
            else
                System.out.print("*");
            System.out.println();
        }


    }
}
