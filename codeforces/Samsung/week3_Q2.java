import java.util.*;

public class week3_Q2 {
    public static void main(String[] args)   {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] q = new int[][3];
            int count=0;

            for(int i=0;i<k;i++){
                int d = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();

                if(x>n || y>n || (d==1 && x!=y) || (d==2 && x==y))
                    count++;
                

            }
		}
	}
}    
}
