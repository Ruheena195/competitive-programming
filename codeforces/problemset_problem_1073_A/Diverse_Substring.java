//package codeforces.problemset_problem_1073_A;
import java.util.*;
public class Diverse_Substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int[] arr = new int[26];

        for(int i=0;i<n;i++)
            arr[s.charAt(i)-'a']++;

        int k = n/2, flag=0;

        for(int i=0;i<26;i++){
            if(arr[i]>k){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("NO");
        else{
            System.out.println("YES");
            System.out.println(s);
        }
    }
    
}
