package Codeforces;
import java.util.Arrays;
import java.util.Scanner;
/*
 Start: 2:39 pm
 End: 2:58 pm
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] cols = new int[Integer.parseInt(scan.nextLine())];
        for (int i = 0; i < cols.length;i++) {
           cols[i] = scan.nextInt();
        }
        Arrays.sort(cols);
        for (int i = 0; i < cols.length;i++) {
            System.out.print(cols[i]+" ");
        }
    }
}