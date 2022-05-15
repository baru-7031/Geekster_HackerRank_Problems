package hackerRank_Problems;

import java.util.Scanner;

public class HackerRank_problem_solve_7
{
    public static void main(String[] args)
    {
        // Take a Character as Input and check whether the character is in Uppercase or Lowercase.

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch))
            System.out.println("Char is Uppercase");
        else
            System.out.println("Char is Lowercase");

    }
}
