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
        int f = s.indexOf("1");
        if(f==-1){
            System.out.println(n);
            return;
        }
        int l =s.lastIndexOf("1");

        int count = Math.max(n-f, l);
        
        System.out.println(2*count);
    }
}
