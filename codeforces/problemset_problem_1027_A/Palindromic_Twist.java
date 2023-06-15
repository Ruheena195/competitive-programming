//package codeforces.problemset_problem_1027_A;
import java.util.*;

public class Palindromic_Twist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            int len = sc.nextInt();
            String s = sc.next();

            solve(s,len);
        }
    }    
    public static void solve(String s, int n){
        int i=0,j=n-1;

        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a==b || Math.abs(a-b)==2){
                i++;
                j--;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
