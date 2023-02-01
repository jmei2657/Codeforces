package Codeforces.problems1000;

import java.util.Scanner;

/*
 Start: 11:14 pm
 End: 11:40 pm
 */
public class Main {
    public static void main(String[] args) {
        String hello = "hello";
        int helloIndex = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int sIndex = 0;
        while (sIndex < s.length()) {
            if (hello.charAt(helloIndex) == s.charAt(sIndex)) {
                helloIndex++;
                if (helloIndex == 5) {
                    System.out.println("YES");
                    return;
                }
            }
            sIndex++;
        }
        System.out.println("NO");
    }
}