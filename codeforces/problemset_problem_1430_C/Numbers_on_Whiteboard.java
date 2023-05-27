//package codeforces.problemset_problem_1430_C;
import java.util.*;

public class Numbers_on_Whiteboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){

            int n = sc.nextInt();
            int a = n;
            int b = n-1;

            System.out.println(2);  // always 2 will be the minimum answer 

            for(int i=1;i<n;i++){
                System.out.println(a + " "+ b);
                a = (a+b+1)/2;
                b--;
            }
        }
    }    
}
