//package codeforces.problemset_problem_118_B;
import java.util.*;

public class Present_from_Lena {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //if n=2 then    rows will be -2 -1 0 1 2
        //spaces for each row will be  4  2 0 2 4
        // Max values of each row  be  0  1 2 1 0
        for(int row=-n;row<=n;row++){
            int spaces = 2*Math.abs(row);

            for(int i=0;i<spaces;i++)
                System.out.print(" ");

            int max = n-Math.abs(row);
            for(int i=0;i<max;i++)
                System.out.print(i+" ");
            
            for(int i=max;i>0;i--)
                System.out.print(i+" ");

            System.out.println(0);
        }
    }
}

////////////////////////////////        BASIC CODE   ///////////////////////////////////////////


// public class Present_from_Lena {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=0;i<=n;i++){

//             for(int sp=0;sp<n-i;sp++)
//                 System.out.print(" "+" ");

//             int j=0;
//             for(;j<i;j++)
//                 System.out.print(j+" ");

//             j=i;
//             for(;j>0;j--)
//                 System.out.print(j+" ");
//             if(j==0)
//                 System.out.print(0);

//             System.out.println();
//         }        
//         for(int i=n-1;i>=0;i--){

//             for(int sp=0;sp<n-i;sp++)
//                 System.out.print(" "+" ");
//             int j=0;
//             for(j=0;j<i;j++)
//                 System.out.print(j+" ");

//             for(j=i;j>0;j--)
//                 System.out.print(j+" ");
//             if(j==0)
//                 System.out.print(0);
            
//             System.out.println();
//         } 
//     }    
// }
