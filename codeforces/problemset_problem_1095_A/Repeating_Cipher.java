//package codeforces.problemset_problem_1095_A;
import java.util.*;

public class Repeating_Cipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        String st = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i=0,count=1;i<len;i=i+count){
            sb.append(st.charAt(i));
            count++;
        }
        System.out.println(sb.toString()); 
    }    
}
