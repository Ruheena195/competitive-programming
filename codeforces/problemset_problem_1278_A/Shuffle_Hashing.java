//package codeforces.problemset_problem_1278_A;
import java.util.*;

public class Shuffle_Hashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String p = sc.next();
            String h = sc.next();

            if(p.length()>h.length()){
                System.out.println("NO");
            }
            else
                solve(p,h);
        }
    }
    
    public static void solve(String p,String h){
        int[] a = new int[26];
        int[] b = new int[26];

        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']++;
            b[h.charAt(i)-'a']++;
        }
        int k=0;
        for(int i=p.length();i<h.length();i++)
        {
            if(Arrays.equals(a,b)){
                System.out.println("YES");
                return;
            }
            b[h.charAt(k)-'a']--;
            b[h.charAt(i)-'a']++;
            k++;
        }
        if(!Arrays.equals(a,b))
            System.out.println("NO");
        else
            System.out.println("YES");
        
    }
}
