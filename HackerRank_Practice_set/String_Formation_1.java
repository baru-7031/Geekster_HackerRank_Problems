package HackerRank_Practice_set;

import java.util.Scanner;

public class String_Formation_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();

        for(int i =0; i<n; i++) {
            int operation = sc.nextInt();

            switch(operation) {
                case 1: {
                    String s1 = "";
                    for(int j =s.length()-1; j>=0; j--) {
                        s1 += s.charAt(j);
                    }
                    s=s1;
                    break;
                }
                case 2: {
                    int num = sc.nextInt();
//                    sc.nextLine();
                    String in = sc.nextLine();
                    if(num == 1) {
                        s = in + s;
                    }
                    else if(num == 2) {
                        s += in;
                    }
                    break;
                }

            }
        }
        s=s.replaceAll(" ", "");
        System.out.println(s);
    }
}
