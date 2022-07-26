package HackerRank_Practice_set;

import java.util.Scanner;

public class Pattern_04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        for (int i=1; i<=(rows * 2 -1); i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == i || j == rows - i + 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
