//package practice;
import java.util.*;

public class w4_q1 {
    static HashMap<Character, String> h;
    static List<String> res;
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    h = new HashMap<>();
    h.put('2', "abc");
    h.put('3', "def");
    h.put('4', "ghi");
    h.put('5', "jkl");
    h.put('6', "mno");
    h.put('7', "pqrs");
    h.put('8', "tuv");
    h.put('9', "wxyz");
    
    int T;
    T=sc.nextInt();

    for(int test_case = 1; test_case <= T; test_case++){
        String num = sc.next();
        res = new ArrayList<>();
        solve("", 0, num, num.length(),res);

        for(int i=0;i<res.size()-1;i++)
            System.out.print(res.get(i)+" ");
        System.out.println(res.get(res.size()-1));
    }

 }
 public static void solve(String s, int index, String num, int len,List<String> res) {
    if(s.length() == len) {
        res.add(s);
        return;
    }
    char ch = num.charAt(index);
    String str = h.get(ch);
    for(int i=0; i<str.length(); i++) {
        solve(s+str.charAt(i), index+1, num, len,res);
    }
 }    
}
