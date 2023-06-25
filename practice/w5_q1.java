import java.util.*;

public class w5_q1 {

    static ArrayList<String> lt;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        lt = new ArrayList<>();
        lt.add("T");
        lt.add("D");

        while(t-- > 0){

            int index = sc.nextInt();
            int len = sc.nextInt();
            String s = sc.next();

            solve(s,index-1);
        }
        //System.out.println(lt);
    }  
    
    public static void solve(String s, int ind){

        if(ind >= lt.size()){
            int n = lt.size();
            for(int i=n;i<=ind;i++){
                StringBuilder sb = new StringBuilder();
                sb.append(lt.get(i-1));
                sb.append(lt.get(i-2));
                lt.add(sb.toString());
            }                            
        }

        String st = lt.get(ind);
        if(st.equals(s))
            System.out.println("yes");
        else
            System.out.println("no");
 
    }
}
