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
                A[i][j] = 1;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(B[i][j]==0)
                    fill(A,i,j,m,n);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int flag=0;
                for(int p=0;p<m;p++)
                    flag |= A[p][j];

                for(int q=0;q<n;q++)
                    flag |= A[i][q];

                if(flag != B[i][j]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
        printMatrix(A, m, n);
    } 

    public static void fill(int[][] A,int p,int q,int m,int n){
        for(int i=0;i<m;i++)
                A[i][q] = 0;
        
        for(int j=0;j<n;j++)
                A[p][j]=0;
    }
    
    public static void printMatrix(int[][] A,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println(A[i][n-1]);
        }
    }
}
