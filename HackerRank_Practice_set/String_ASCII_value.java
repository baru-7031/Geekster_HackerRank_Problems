package HackerRank_Practice_set;

import java.util.Scanner;

public class String_ASCII_value
{

    static int ASCII(String str)
    {
        int re = 0;
        int n = str.length();
        for (int i =0; i<n; i++)
        {
            re += str.charAt(i);
        }
        return re;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();



    }
}
