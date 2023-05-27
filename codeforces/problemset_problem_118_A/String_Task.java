//package codeforces.problemset_problem_118_A;
import java.util.*;

public class String_Task {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<st.length();i++){

            char ch = st.charAt(i);

            if(ch!='a' && ch!='A' && ch!='e' && ch!='E' && ch!='y'&& ch!='Y' && ch!='i'&& ch!='I' && ch!='o' && ch!='O' && ch!='u' && ch!='U'){
                sb.append('.').append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
    }    
}
