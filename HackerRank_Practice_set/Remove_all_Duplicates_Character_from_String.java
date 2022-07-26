package HackerRank_Practice_set;

import java.util.Scanner;

public class Remove_all_Duplicates_Character_from_String
{
    static String deleteDuplicate(String str)
    {
        String remove = "";
        int n = str.length();
        for (int i=0; i<n-1; i++)
        {
            if (str.charAt(i) != str.charAt(i+1))
                remove += str.charAt(i);
        }
        if (str.charAt(n-1) != str.charAt(n-2))
            remove += str.charAt(n-1);
        return remove;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();

        System.out.print(deleteDuplicate(s));

    }
}
