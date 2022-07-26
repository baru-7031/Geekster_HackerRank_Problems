package HackerRank_Practice_set;

import java.util.Arrays;
import java.util.Scanner;

public class Isogramic_String
{
    static boolean checkingIsgramic(String str)
    {
        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        for (int i =0; i<ch.length-1; i++)
            if (ch[i] == ch[i+1])
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (checkingIsgramic(str))
            System.out.println("Isogram");
        else
            System.out.println("Not an Isogram");
    }
}
