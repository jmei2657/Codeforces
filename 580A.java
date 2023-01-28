package Codeforces;

import java.util.Scanner;
/*
 Start: 5:47 pm
 End: 5:59 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] money = new int[scan.nextInt()];
        for (int i = 0; i < money.length;i++) {
            money[i] = scan.nextInt();
        }
        int longestNonDecreasing = 1;
        int currentIncreasing = 1;
        for (int i = 1; i < money.length;i++) {
            if (money[i] >= money[i-1]) {
                currentIncreasing++;
            } else {
                if (longestNonDecreasing < currentIncreasing) {
                    longestNonDecreasing = currentIncreasing;
                }
                currentIncreasing = 1;
            }
        }
        if (currentIncreasing > longestNonDecreasing) {
            longestNonDecreasing = currentIncreasing;
        }
        System.out.println(longestNonDecreasing);
    }
}