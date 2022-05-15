package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i<num; i++)
        {
            for (int j = 1; j<=i+1;j++)
            {
                if (j != num)
                    System.out.print(j+"    ");
                else
                    System.out.print(j);
            }
            for (int k = 1;k<num-i-1;k++ )
                System.out.print("    ");
            for (int k1 = 1;k1<num-i-1;k1++ )
                System.out.print("    ");
            for (int x = i+1; x>=1;x--)
            {
                if (x != num)
                    System.out.print("    " + x);
            }
            System.out.println();
        }

    }
}
