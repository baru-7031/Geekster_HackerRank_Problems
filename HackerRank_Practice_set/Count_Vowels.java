package HackerRank_Practice_set;

import java.util.Locale;
import java.util.Scanner;

public class Count_Vowels
{
    static int countVowels(String str, int n)
    {
        int count =0;
        str = str.toLowerCase(Locale.ROOT);
        for (int i =0; i<n;i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length();
        System.out.println(countVowels(str, n));

    }
}
