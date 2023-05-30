//package codeforces.problemset_problem_131_A;
import java.util.*;

public class cAPS_lOCK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        if(word.equals(word.toUpperCase()))
            System.out.println(word.toLowerCase());
        
        else if(Character.isLowerCase(first) && word.substring(1).equals(word.substring(1).toUpperCase())){
            System.out.println(Character.toUpperCase(first)+word.substring(1).toLowerCase());
        }
        else
            System.out.println(word);
    }    
}
