package Codeforces.problems1300;
import java.util.Scanner;
import java.util.HashMap;
/*
 Start: 3:32 pm
 End: 3:36 pm
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRequests = Integer.parseInt(scan.nextLine());
        HashMap<String,Integer> used = new HashMap<>();
        for (int i = 0; i < numRequests; i++) {
            String s = scan.nextLine();
            if (used.containsKey(s)) {
                System.out.println(s+used.get(s));
                used.put(s,used.get(s)+1);
            } else {
                System.out.println("OK");
                used.put(s,1);
            }
        }
    }
}