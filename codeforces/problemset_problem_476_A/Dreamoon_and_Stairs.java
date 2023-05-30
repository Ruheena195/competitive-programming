//package codeforces.problemset_problem_476_A;
import java.util.*;
public class Dreamoon_and_Stairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n<m){
            System.out.println(-1);
            return;
        }
        int res = 0;
        
        if(n%2==0)
            res = n/2;
        else
            res = n/2 + 1;

        while(res%m != 0)
            res++;

        System.out.println(res);        
    }
}




///////////////////////////////////////////////////////////////////////////////////////////////////////

/*
public class Dreamoon_and_Stairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n<m){
            System.out.println(-1);
            return;
        }
        if(n==m){
            System.out.println(m);
            return;
        }
        int res = findMinMoves(n,m,0);
        System.out.println(res);
    }
    
    public static int findMinMoves(int n,int m, int count){
        if(n<=0){
            count = (count%m == 0) ? count: 10000;
            return count;
        }

        int ans = Math.min(findMinMoves(n-1, m,count+1), findMinMoves(n-2, m, count+1));

        return ans;

    }
}
*/
