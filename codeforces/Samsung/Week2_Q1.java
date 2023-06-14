//package codeforces.Samsung;
import java.util.*;
public class Week2_Q1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int steps = sc.nextInt();

            ArrayList<String> lt = new ArrayList<>();
            int flag=0;

            for(int s = 1; s <= steps; s++){
                
                int val = sc.nextInt();
                
                if(val==1){

                    String st = sc.next();

                    if(flag==1)
                        lt.add(0,st);
                    else
                        lt.add(st);               
                   
                }
                else if(val==2){
                    flag = 1-flag;
                }
                
                
            }
            int index = sc.nextInt();
            index = (flag==0)? index : lt.size()-1-index;

            System.out.println(lt.get(index));
		}
	}    
}

