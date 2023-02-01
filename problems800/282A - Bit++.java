package Codeforces.problems800;

import java.util.Scanner;
// 1/24/2024
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = Integer.parseInt(scan.nextLine());
        int x = 0;
        for (int i = 0; i < numLines; i++) {
            String s = scan.nextLine();
            if (s.charAt(1) == '-') {
                x--;
            } else {
                x++;
            }
        }
        scan.close();
        System.out.println(x);
    }
}

