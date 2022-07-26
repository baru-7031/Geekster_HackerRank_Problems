package HackerRank_Practice_set;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_all_Duplicates_character_from_Unsorted_Stirng
{
    static String deleteDuplicate(String str)
    {
        String result = "";
        HashSet<Character> hs = new HashSet<>();

        for (int i =0; i<str.length(); i++)
            hs.add(str.charAt(i));

        for (char element : hs)
        {
            result += element;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(deleteDuplicate(str));

    }
}
