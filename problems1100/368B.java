package Codeforces.problems1100;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 Start: 6:04 pm
 End: 6:18 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n;i++) {
            array[i] = scan.nextInt();
        }
        int[] distinct = new int[n];
        Set<Integer> distincts = new HashSet<>();
        for (int i = n-1;i>=0;i--) {
            if (i == n-1) {
                distinct[i] = 1;
                distincts.add(array[i]);
            } else {
                distinct[i] = distinct[i+1];
                if (!distincts.contains(array[i])) {
                    distincts.add(array[i]);
                    distinct[i]++;
                }
            }
        }
        for (int i = 0; i < m;i++) {
            System.out.println(distinct[scan.nextInt()-1]);
        }
    }
}