//package practice;
import java.util.*;

public class w4_q2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

		int T =sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String str = sc.next();
            int rows = sc.nextInt();

            solve(str,rows);
		}
    }

    public static void solve(String str, int rows){

        if(rows==1) {
            System.out.println(str);
            return;
        }
        // StringBuilder res=new StringBuilder();
        // int diff=2*(rows-1);
        
        // for(int i=0;i<rows;i++){
        //     int j=i;
        //     int d=diff-2*i;
        //     while(j<str.length()){
        //         res.append(str.charAt(j));
        //         if(i>0 && i<rows-1 && j+d<str.length() ){
        //             res.append(str.charAt(j+d));
        //         }
        //         j+=diff;
        //     }
        // }
    
        // System.out.println(res.toString());

        StringBuilder[] sb = new StringBuilder[rows];
        for(int i=0;i<rows;i++)
            sb[i] = new StringBuilder("");

        int index=0;
        int inc=1;

        for(int i=0;i<str.length();i++){
            sb[index].append(str.charAt(i));

            if(index==0) inc=1;
            if(index==rows-1) inc=-1;

            index += inc;
        }

        StringBuilder res = new StringBuilder();

        for(int i=0;i<rows;i++)
            res.append(sb[i]);

        System.out.println(res.toString());

    }
}
