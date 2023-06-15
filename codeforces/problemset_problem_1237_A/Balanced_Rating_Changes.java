//package codeforces.problemset_problem_1237_A;
import java.util.*;
public class Balanced_Rating_Changes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] rating = new int[n];

        for(int i=0;i<n;i++)
            rating[i] = sc.nextInt();

        int flag=0;

        for(int i=0;i<n;i++){
            if(rating[i]==0 || rating[i]%2==0)
                rating[i] = rating[i]/2;

            else {
                if(flag==0)        
                    rating[i] = (int)Math.floor((1.0*rating[i])/2);

                else
                    rating[i] = (int)Math.ceil((1.0*rating[i])/2);

                flag = 1-flag;
            }          
        }
        for(int i=0;i<n;i++)
            System.out.println(rating[i]);
    }    
}
