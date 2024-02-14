import java.util.*;

public class Themancode {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            double max = Math.ceil(n / 2.0);
            double min = Math.ceil(n / 3.0);
            System.out.println((int) max + " " + (int) min);
        }
    }
}
