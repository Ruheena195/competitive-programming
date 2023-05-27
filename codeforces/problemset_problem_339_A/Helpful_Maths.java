//package codeforces.problemset_problem_339_A;
import java.util.*;

public class Helpful_Maths {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int[] arr = new int[(st.length()/2)+1];

        for(int i=0, j=0;i<st.length();i=i+2)
            arr[j++] = st.charAt(i)-'0';

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length-1;i++)
            sb.append(arr[i]).append('+');

        sb.append(arr[arr.length-1]);

        System.out.println(sb.toString());
    }
    
}
