//package codeforces.problemset_problem_1303_A;
import java.util.*;

public class Erasing_Zeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-- > 0){

            String st = sc.next();
            int first = st.indexOf('1');
            int last = st.lastIndexOf('1');
            int count=0;

            for(int i=first+1;i<last;i++){
                if(st.charAt(i)=='0')
                    count++;
            }
            System.out.println(count);
        }
    }
    
}
