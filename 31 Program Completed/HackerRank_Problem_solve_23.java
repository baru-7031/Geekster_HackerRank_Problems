package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_Problem_solve_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;
        for (int i = 1; i<=range;i++)
        {
            for (int j = i+1; j<=range;j++)
            {
                if ((i+j) == target)
                {
                    ++count;
                }

            }
        }
        System.out.println(count);

    }
}
