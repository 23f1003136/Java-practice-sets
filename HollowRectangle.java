import java.util.*;

class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
// to make a hollow rectangle pattern of * of a*b size

        // outer loop
        for (int i = 1; i <= a; i++) {
            // inner loop
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}