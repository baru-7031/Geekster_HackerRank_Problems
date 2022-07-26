package HackerRank_Practice_set;

import java.util.Scanner;

public class Check_Pythagoras_Triplet
{
    static String find(int num)
    {
        for (int i =10; i*i<=num;i++)
        {
            for (int j =0; j*j<=num; j++)
            {
                if ((i*i)+(j*j) == num)
                    return "True";
            }
        }
        return "False";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(find(num));

    }
}
