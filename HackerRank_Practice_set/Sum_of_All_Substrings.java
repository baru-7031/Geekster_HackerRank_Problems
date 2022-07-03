package HackerRank_Practice_set;

import java.util.Scanner;

public class Sum_of_All_Substrings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int sum =0;
        int n = str.length();

        for (int i =0; i<n; i++)
        {
            String s = "";
            for (int j =i; j<n; j++)
            {
                s += str.charAt(j);
                int temp = Integer.parseInt(s);
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}
