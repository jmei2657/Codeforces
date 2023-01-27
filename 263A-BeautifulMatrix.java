package Codeforces;

import java.util.Scanner;
// 1/25/2023
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int row = 0;
        do {
            s = scan.nextLine();
            row++;
        } while (s.indexOf('1') == -1);
        int col = (s.indexOf('1')/2)+1;
        System.out.println(Math.abs(3-row)+Math.abs(3-col));
    }
}