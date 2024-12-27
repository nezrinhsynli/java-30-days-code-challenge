import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println(i+4);
        System.out.println(d+4);
        System.out.println("HackerRank " + s);
    }
}
