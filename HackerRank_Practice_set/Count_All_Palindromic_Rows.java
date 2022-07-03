package HackerRank_Practice_set;

import java.util.Scanner;

public class Count_All_Palindromic_Rows
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i =0; i<m;i++)
        {
            for (int j =0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int count =0;
        for (int i =0; i<m;i++)
        {
            int k=0, j=n-1;
            boolean found = true;
            while(k<j)
            {
                if (arr[i][k] != arr[i][j])
                {
                    found = false;
                    break;
                }
                k++;
                j--;
            }

            if (found)
                count++;
        }

        System.out.println(count);

    }
}
