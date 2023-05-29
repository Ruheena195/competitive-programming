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

            for(int i=k;i>0;i--){
                for(int j=0;j<26;j++){

                    if(arr[j]==0)
                        continue;

                    else if(arr[j]%i!=0){
                        flag=1;
                        break;
                    }
                    else{
                        int t = arr[j]/i;
                        while(t-- > 0)
                            sb.append((char)(j+'a'));
                        arr[j] -= (arr[j]/i);
                    }
                }

                if(flag==1)
                    break;
            }

            if(flag==1)
                System.out.println(-1);
            else
                System.out.println(sb.toString());
        }

    }
    
}
