package HackerRank_Practice_set;

import java.util.Scanner;

public class Count_Non_Vowel_String
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String nonVowel = "";

        for (int i =0; i<str.length();i++)
        {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u')
                nonVowel += str.charAt(i);
        }

        int count =0;
        for (int i=0; i<nonVowel.length(); i++)
        {
            String temp = "";
            for (int j =i; j<nonVowel.length(); j++)
            {
                count++;
            }
        }

        System.out.println(count);


    }
}
