package HackerRank_Practice_set;

import java.util.Scanner;

public class Substrings_Starting_and_Ending_with_same_Character
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        char start = str.charAt(0);
//        int end =0;
//        int n = str.length();
//        for (int i =n-1; i>0; i--)
//        {
//            if (start == str.charAt(i))
//            {
//                end = i+1;
//                break;
//            }
//        }
//        int count =0;
//        for (int i =0; i<end; i++)
//        {
//            String sub = "";
//            for (int j =i; j<end; j++)
//            {
//                sub += str.charAt(j);
//                System.out.print(sub + " ");
//                count++;
//            }
//        }
//        System.out.println(count);







        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                char first='-';
                char last='-';
                for(int k=i;k<j;k++){
                    char ch=s.charAt(k);
                    if(first=='-')
                        first=ch;
                    last=ch;
                }
                if(first==last)
                    count++;
            }
        }
        System.out.println(count);

    }
}
