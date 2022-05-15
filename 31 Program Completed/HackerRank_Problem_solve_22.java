package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_Problem_solve_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        for (int i =1; i<=num;i++)
        {
            for (int j = i+1; j<=num; j++)
            {
                if ((i+j)%2==0)
                {
                    ++count;
                }
            }
        }
        System.out.println(count);

    }
}
