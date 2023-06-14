//package codeforces.problemset_problem_486_B;
import java.util.*;

public class OR_in_Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] B = new int[m][n];
        int[][] A = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                B[i][j] = sc.nextInt();
                A[i][j] = -1;
            }
        }


    }    
}
