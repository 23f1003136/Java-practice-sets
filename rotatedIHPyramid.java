import java.util.*;

class RotatedIHPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        //outer loop
        for (int i = 1; i <= a; i++) {            
           // inner loop -> for spaces
            for (int j = 1; j <= a-i; j++) { 
                System.out.print(" ");
            }
            // inner loop -> for Xs
            for (int j = 1; j <= i; j++) { 
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
