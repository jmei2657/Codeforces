package Codeforces.problems1300;

import java.util.Scanner;
/*
 Start: 2:34 pm
 End: 2:54 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length;i++) {
            array[i] = scan.nextInt();
        }
        int start = 0;
        int end = 0;
        boolean alreadyDecreased = false;
        for (int i = 1; i < array.length;i++) {
            if (array[i] < array[i-1]) {
                if (alreadyDecreased) {
                    System.out.println("no");
                    return;
                }
                end++;
            } else {
                if (end-start > 0) {
                    alreadyDecreased = true;
                } else {
                    if (!alreadyDecreased) {
                        start++;
                        end++;
                    }
                }
            }
        }
        if (start == end) {
            System.out.println("yes\n"+(start+1)+" "+(end+1));
        } else if ((end+1 >= array.length || array[end+1] >= array[start]) && (start-1 < 0 || array[start-1] <= array[end])) {
            System.out.println("yes\n"+(start+1)+" "+(end+1));
        } else {
            System.out.println("no");
        }
    }
}