// pallindromic number pattern
// for n=5
//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5

import java.util.*;

class pattern13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop -> for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // inner loop -> left half
            for (int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            // inner loop -> right half
            for (int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
