package HackerRank_Practice_set;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Locate_the_target_string
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();
        String value = sc.nextLine();
        System.out.println(str.indexOf(value));
    }
}
