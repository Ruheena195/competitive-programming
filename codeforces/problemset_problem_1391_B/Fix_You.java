//package codeforces.problemset_problem_1391_B;
import java.util.*;

public class Fix_You {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){

            int m = sc.nextInt();
            int n = sc.nextInt();
            String[] str = new String[m];

            for(int i=0;i<m;i++)
                str[i] = sc.next();

            int res=0;          

            for(int i=0;i<m-1;i++){
                if(str[i].charAt(n-1) != 'D')
                    res++;
            }
            for(int j=0;j<n-1;j++){
                if(str[m-1].charAt(j) != 'R')
                    res++;
            }
            System.out.println(res);
        }
    }    
}
