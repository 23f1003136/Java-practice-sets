import java.util.*;

// Floyd's Triangle Pattern

class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}