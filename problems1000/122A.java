package Codeforces.problems1000;

import java.util.Scanner;

/*
 Start: 8:57 pm
 End: 9:04 pm
 */
public class Main {
    public static void main(String[] args) {
        //4, 7, 47, 74, 447, 474, 744, 747, 777
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int index = 0;
        int[] lucky = {4,7,47,74,444,447,474,477,744,747,774,777};
        while (index < lucky.length && num >= lucky[index]) {
            if (num%lucky[index] == 0) {
                System.out.print("YES");
                return;
            }
            index++;
        }
        System.out.println("NO");
    }
}