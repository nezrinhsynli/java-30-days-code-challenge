package Day3;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();


        if (N % 2 != 0 || N == 20) {
            System.out.println("Weird");
        } else if (N < 6) {
            System.out.println("Not Weird");
        } else if (N < 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }


    }
}
