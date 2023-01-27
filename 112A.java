package Codeforces;

import java.util.Scanner;
// 1/26/2023
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine().toLowerCase();
        String s2 = scan.nextLine().toLowerCase();
        int compared = s1.compareTo(s2);
        System.out.println(compared == 0 ? 0: compared < 0 ? -1:1);
    }
}