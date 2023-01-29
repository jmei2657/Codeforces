package Codeforces;

import java.util.Scanner;

/*
 Start: 6:03 pm
 End: 7:06 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long numbers = scan.nextLong();
        for (int i = 0; i < numbers;i++) {
            long temp = scan.nextLong();
            double sq = Math.sqrt((double)temp);
            if (temp == 1) {
                System.out.println("NO");
            } else {
                if (sq-(int)sq > 0) {
                    System.out.println("NO");
                } else {
                    long a = (long)Math.sqrt((double)temp);
                    if (a == 2 || a == 3) {
                        System.out.println("YES");
                    } else {
                        if (a%2 == 0 || a%3 == 0) {
                            System.out.println("NO");
                        } else {
                            long num = 5;
                            boolean printed = false;
                            while (num <= Math.sqrt((double)a)) {
                                if (a%(num) == 0 || a%(num+2) == 0) {
                                    System.out.println("NO");
                                    printed = true;
                                    break;
                                } else {
                                    num += 6;
                                }
                            }
                            if (!printed) {
                                System.out.println("YES");
                            }
                        }
                    }
                }
            }
        }
    }
}