package Codeforces.problems1000;

import java.util.Scanner;

/*
 Start: 10:00 pm
 End: 10:08 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vectorSum = new int[3];
        int numTimes = scan.nextInt();
        for (int i = 0; i < numTimes;i++) {
            vectorSum[0] += Integer.parseInt(scan.next());
            vectorSum[1] += Integer.parseInt(scan.next());
            vectorSum[2] += Integer.parseInt(scan.next());
        }
        if (vectorSum[0] == 0 && vectorSum[1] == 0 && vectorSum[2] == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}