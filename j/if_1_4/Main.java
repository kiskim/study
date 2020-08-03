package if_1_4;

import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        int a, b;
        char c;
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        c = a > 0 ? (b > 0 ? '1' : '4') : (b > 0 ? '2' : '3');
        System.out.println(c);
        scn.close();
    }
}