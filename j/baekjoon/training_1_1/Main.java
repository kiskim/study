package baekjoon.training_1_1;

import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        int res = 0;
        int temp;
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            temp = scn.nextInt();
            res +=  temp >= 40 ? temp : 40;
        }
        scn.close();
        System.out.println(res / 5);
    }
}