package HackerRank_Practice_set;

import java.util.Scanner;

public class Java_Inheritance_II
{
    public static void main(String[] args) {

        Adder ad = new Adder();

        int a = 13;
        int b = 20;
//        ad.add()

    }
}

class Arithmetic {
    int add (int a, int b) {
        return a+b;
    }
}

class Adder extends Arithmetic {
    Adder() {
        System.out.println("My superclass is: Arithmetic");
    }
}
