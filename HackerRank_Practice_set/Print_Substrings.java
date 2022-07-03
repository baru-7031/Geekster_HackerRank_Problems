package HackerRank_Practice_set;

import java.util.Scanner;

public class Print_Substrings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length();

        for (int i =0; i<n; i++)
        {
            String s = "";
            for (int j =i; j<n; j++)
            {
                s += str.charAt(j);

                System.out.print(s + " ");
            }
        }

    }
}
