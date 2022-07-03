package HackerRank_Practice_set;

import java.util.Scanner;

public class Is_Valid_Square
{
    static boolean perfectSquare(double num)
    {
        double sqrt = Math.sqrt(num);

        System.out.println(sqrt);
        System.out.println(Math.floor(sqrt));

        return ((sqrt-Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();

        if (perfectSquare(n))
            System.out.println("True");
        else
            System.out.println("False");

    }
}
