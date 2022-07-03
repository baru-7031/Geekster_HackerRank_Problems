package HackerRank_Practice_set;

import java.util.Scanner;

public class Reverse_Words_in_a_Given_String
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sent = sc.nextLine();

        String[] rev = sent.split(" ");

        int n = rev.length;
        for (int i =n-1; i>=0; i--)
        {
            System.out.print(rev[i] + " ");
        }
    }
}
