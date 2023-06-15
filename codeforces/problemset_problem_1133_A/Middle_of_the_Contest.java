//package codeforces.problemset_problem_1133_A;
import java.util.*;

public class Middle_of_the_Contest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      

        String s1 = sc.next();
        String s2 = sc.next();

        int h1 = Integer.parseInt(s1.substring(0, 2));
        int m1 = Integer.parseInt(s1.substring(3));
        int h2 = Integer.parseInt(s2.substring(0, 2));
        int m2 = Integer.parseInt(s2.substring(3));

        int t1 = h1*60+m1;
        int t2 = h2*60+m2;

        int t3 = (t1+t2)/2;

        int h = t3/60;
        int m = t3%60;

        // int t = (Math.abs(t1-t2))/2;
        // int h=0,m=0;

        // if(t1<t2){
        //     m = (m1+t)%60;
        //     h = h1 + (m1+t)/60;
        // }
        // else{
        //     m = (m2+t)%60;
        //     h = h2 + (m2+t)/60;
        // }

        if(h<10)
            System.out.print("0");
        
        System.out.print(h+":");

        if(m<10)
            System.out.print("0");
        
        System.out.println(m);

    }    
}
