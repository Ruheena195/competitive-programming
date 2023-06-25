//package codeforces.problemset_problem_1073_A;
import java.util.*;
public class Diverse_Substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();

        int start=0;

        for(int end=0;end<n;end++){
            int val = s.charAt(end)-'a';
            arr[val]++;
            sb.append(s.charAt(end));

            while(sb.length()>1 && arr[val]>(sb.length()/2)){
                arr[s.charAt(start)-'a']--;
                start++;
                sb.delete(0,1);
            }

            if(sb.length()>1){
                System.out.println("YES");
                System.out.println(sb.toString());
                return;
            }
        }
        System.out.println("NO");
        
    }
    
}
