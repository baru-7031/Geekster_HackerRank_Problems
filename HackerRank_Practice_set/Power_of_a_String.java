package HackerRank_Practice_set;

import java.util.Scanner;

public class Power_of_a_String
{
    static boolean powerofstring(String str){
        int n = str.length();
        int[] arr = new int[256];
        for(int i=0;i<n;i++){
            int ind=str.charAt(i);
            arr[ind]+=1;
        }
        int max = 0;
        for(int i=1;i<256;i++){
            if(arr[i]>0)
                max++;
        }
        if(max==1)
            return true;
        return false;
    }
    static int subStrings(String str){
        int maxLen = 0;
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                String s = "";
                for(int k=i;k<j;k++)
                    s = s+str.charAt(k);
                if(powerofstring(s))
                    maxLen = Math.max(s.length(),maxLen);
            }
        }
        return maxLen;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(subStrings(str));

    }
}
