package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i<num; i++)
        {
            for (int j = 1; j<=i+1;j++)
            {
                    System.out.print(j + "\t");
            }
            for (int k = 0;k<num-i-1;k++)
                System.out.print("\t");
            for (int k1 = 0;k1<num-i-2;k1++ )
                System.out.print("\t");
            for (int x = i+1; x>=1;x--)
            {
                if (x != num)
                    System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
