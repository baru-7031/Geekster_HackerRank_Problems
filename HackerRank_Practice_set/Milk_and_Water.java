package HackerRank_Practice_set;

import java.util.Scanner;

public class Milk_and_Water
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr1 = new int[N];

        for (int i = 0; i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i<arr1.length;i++)
        {
            for (int j =1; j<arr1.length;j++)
            {
                if (0<arr1[j])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;
                }

//                if (0<arr1[j])
//                {
//                    int temp = arr1[j];
//                    arr1[j] = arr1[j+1];
//                    arr1[j+1] = temp;
//                }

            }
        }
        for (int x : arr1)
            System.out.print(x + " ");


    }
}
