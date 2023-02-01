package Codeforces.problems1100;

import java.util.Scanner;

/*
 Start: 3:13 pm
 End: 4:35 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int numQueries = scan.nextInt();
        int[] answers = new int[s.length()];
        for (int i = 0; i < s.length()-1;i++) {
            if (s.charAt(i)==s.charAt(i+1)) {
                answers[i+1] = answers[i]+1;
            } else {
                answers[i+1] = answers[i];
            }
        }
        for (int i = 0; i < numQueries;i++) {
            int start = scan.nextInt()-1;
            int end = scan.nextInt()-1;
            System.out.println(answers[end]-answers[start]);
        }
        scan.close();
    }
}