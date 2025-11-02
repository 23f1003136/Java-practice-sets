// number Pyramid
// for n=5
//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5

import java.util.*;

class pattern12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop -> for spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inner loop -> for numbers
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
