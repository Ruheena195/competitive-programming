//package codeforces.problemset_problem_785_A;
import java.util.*;

public class Anton_and_Polyhedrons {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int res=0;

        while(t-- > 0){
            String str = sc.next();

            switch(str){
                case "Tetrahedron": 
                                    res += 4;
                                    break;

                case "Cube": 
                                    res += 6;
                                    break;
                case "Octahedron":
                                    res += 8;
                                    break;
                case "Dodecahedron":
                                    res += 12;
                                    break;
                case "Icosahedron":
                                    res += 20;
                                    break;
            }
        }
        System.out.println(res);
    }    
}
