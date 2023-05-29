//package codeforces.problemset_problem_219_A;
import java.util.*;

public class kString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String st = sc.next();

        if(st.length()%k !=0)
            System.out.println(-1);

        else{
            
            StringBuilder sb = new StringBuilder();
            int[] arr = new int[26];

            for(int i=0;i<st.length();i++)
                arr[st.charAt(i)-'a']++;

            int flag=0;

            for(int j=0;j<26;j++){

                if(arr[j]%k!=0){
                    // flag=1;
                    // break;
                    System.out.println(-1);
                    return;
                }
                else{
                    int t = arr[j]/k;
                    while(t-- > 0)
                        sb.append((char)(j+'a'));
 
                }
            }
            StringBuilder res = new StringBuilder();
            while(k-- > 0)
                res.append(sb);

            System.out.println(res.toString());
        }

    }
    
}
