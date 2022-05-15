package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arrays = new int[num];
        for (int i = 0; i<num;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (i%2==0)
                arrays[i] = a+b;
            else
                arrays[i] = a*b;
        }
        for (int x : arrays)
            System.out.println(x);


    }
}
