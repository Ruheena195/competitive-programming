//package codeforces.problemset_problem_1097_A;

import java.util.*;

public class Gennady_and_a_Card_Game {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String table_card = sc.next();
        String[] hand_cards = new String[5];

        int flag=0;

        for(int i=0;i<5;i++){

            hand_cards[i] = sc.next();

            if(hand_cards[i].charAt(0)==table_card.charAt(0) || hand_cards[i].charAt(1)==table_card.charAt(1)){
                flag=1;
                break;
            }    
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
