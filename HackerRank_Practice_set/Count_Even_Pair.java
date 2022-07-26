package HackerRank_Practice_set;

import java.util.Scanner;

public class Count_Even_Pair
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for (int i =1; i<=n; i++)
        {
            for (int j =i+1; j<=n; j++)
                if ((i+j)%2 ==0)
                    count++;
        }

        System.out.println(count);
    }
}
