package Day6;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < count; i++) {
            String s = scan.nextLine();
            char[] arr = s.toCharArray();

            StringBuilder sEven = new StringBuilder();
            StringBuilder sOdd = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    sEven.append(arr[j]);
                } else {
                    sOdd.append(arr[j]);
                }
            }
            System.out.println(sEven + " " + sOdd);
        }
    }
}
