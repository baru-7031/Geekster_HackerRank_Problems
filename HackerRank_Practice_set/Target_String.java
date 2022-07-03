package HackerRank_Practice_set;

import java.util.Scanner;

public class Target_String
{
    static boolean rotationCheck(String str, String target)
    {
        int i;
        String a="";
        String b="";
        for (i=0; i<str.length()/2; i++)
        {
            a += str.charAt(i);
        }
        for (; i<str.length(); i++)
        {
            b += str.charAt(i);
        }
        return (b+a).equals(target);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();

        if(rotationCheck(str,target))
            System.out.println("True");
        else
            System.out.println("False");

    }
}
