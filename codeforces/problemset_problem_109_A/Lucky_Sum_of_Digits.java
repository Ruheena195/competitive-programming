//package codeforces.problemset_problem_109_A;
import java.util.*;
public class Lucky_Sum_of_Digits {
    static int flag;
    static String ans;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c4=0,c7=0;

        while(n>0){
                    
            if(n%7==0){
                c7 += n/7;
                n = n%7;
                if(n==0)
                    break;
            }

            n-=4;
            c4++;
        }
        if(n==0){
            while(c4-- > 0)
                System.out.print(4);
            while(c7-- > 0)
                System.out.print(7);
        }  
        else
            System.out.println(-1);      
    }
}

/*
 flag=0;
        ans="";
        int n = sc.nextInt();
        String s = solve(n,"");

        if(ans.equals(""))
            System.out.println(-1);
        else
            System.out.println(ans);        
    }

    public static String solve(int n, String s){
        if(n==0){
            if(flag==0){
                flag=1;
                ans=s;
                return s;
            }
            else {
                if(s.length()<ans.length()){
                    ans=s;
                    return s;
                }          
                return "";
            }
        }

        else if(n<0)
            return "";

        return solve(n-4,s+"4")+solve(n-7,s+"7");
 */
