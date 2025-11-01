import java.util.*;

class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=1; i<=a; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}