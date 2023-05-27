//package codeforces.problemset_problem_492_A;
import java.util.*;
public class Vanya_and_Cubes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum=1, total=1, height=0;

        for(int i=2;total<=N;i++){
            height++;
            sum += i;
            total += sum;
        }
        System.out.println(height);
    }    
}
