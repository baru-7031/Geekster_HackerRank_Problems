package HackerRank_Practice_set;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram
{

    static String sortString(String str)
    {
        char[] tempArray = str.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();

        String n2 = sc.nextLine();

        String check1 = sortString(n1);
        String check2 = sortString(n2);

        if (check1.equals(check2))
            System.out.println("True");
        else
            System.out.println("False");


    }
}
