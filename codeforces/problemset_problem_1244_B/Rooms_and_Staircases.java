//package codeforces.problemset_problem_1244_B;
import java.util.*;

public class Rooms_and_Staircases {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            solve(s,n);
        }
    }    
    public static void solve(String s, int n){

        if(s.charAt(0)=='1' || s.charAt(n-1)=='1'){
            System.out.println(2*n);
            return;
        }
        
        int left=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                left=i;
                break;
            }
        }
        int i=-1, right=-1;

        for(int j=n-1;j>=0;j--){
            i++;
            if(s.charAt(j)=='1'){
                right=i;
                break;
            }
        }
        int res=0;
        if(right==-1)
            res = n;
        else
            res = 2*(n-Math.min(left,right));

        System.out.println(res);
    }
}
