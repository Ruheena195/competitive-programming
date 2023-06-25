//package practice;
import java.util.*;

public class w4_q3 {

    static int getMid(int s, int e)    {
        return s + (e - s) / 2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] prices = new int[n];
            int[] sweet = new int[n];
            List<int[]> lt = new LinkedList<>();

            for(int i=0;i<n;i++)
                prices[i] = sc.nextInt();

            for(int i=0;i<n;i++){
                sweet[i] = sc.nextInt();
                lt.add(new int[]{prices[i],sweet[i]});
            }
            Collections.sort(lt, (a,b)->a[0]-b[0]);

            Map<Integer, Map<Integer,Integer>> h = new HashMap<>();

            for(int i=1;i<=100;i++){
                Map<Integer,Integer> innerMap = new HashMap<>();

                for(int j=i;j<100;j++){

                    int maxValue = -1;
                    int maxIndex = -1;

                    for(int k=0;k<lt.size();k++){
                        int[] temp = lt.get(k);
                        if(temp[0]>=i && temp[0]<=j){
                            if(maxValue<temp[1]){
                                maxValue = temp[1];
                                maxIndex = k;
                            }
                        }
                        if(temp[0]>j)
                            break;
                    }
                    innerMap.put(j,maxIndex);                                     
                }
                h.put(1,innerMap);
            }

            for(int i=0;i<k;i++){
                int count=0;
                int l = sc.nextInt();
                int h = sc.nextInt();

            }

        }
    }  
    static int[] constructST(int arr[], int n)    {

        // Height of segment tree
        int x = (int)Math.ceil(Math.log(n) / Math.log(2));
 
        // Maximum size of segment tree
        int max_size = 2 * (int)Math.pow(2, x) - 1;
 
        // Allocate memory
        int[] st = new int[max_size];
 
        // Fill the allocated memory st
        constructSTUtil(arr, 0, n - 1, st, 0);
 
        // Return the constructed segment tree
        return st;
    }
    
    static int constructSTUtil(int arr[],int ss, int se,int[] st, int si)  {
 
        // If there is one element in array, store
        // it in current node of segment tree and return
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }
 
        // If there are more than one elements, then
        // recur for left and right subtrees and
        // store the max of values in this node
        int mid = getMid(ss, se);
 
        st[si] = Math.max(
            constructSTUtil(arr, ss, mid,st, si * 2 + 1),
            constructSTUtil(arr, mid + 1,se, st,si * 2 + 2));
 
        return st[si];
    }
    static void updateValue(int arr[], int[] st, int ss,int se, int index,int value,int node)
    {
        if (index < ss || index > se) {
            System.out.println("Invalid Input");
            return;
        }
 
        if (ss == se) {
 
            // update value in array and in
            // segment tree
            arr[index] = value;
            st[node] = value;
        }
        else {
            int mid = getMid(ss, se);
 
            if (index >= ss && index <= mid)
                updateValue(arr, st, ss, mid,index, value,2 * node + 1);
            else
                updateValue(arr, st, mid + 1, se, index,value, 2 * node + 2);
 
            st[node] = Math.max(st[2 * node + 1],st[2 * node + 2]);
        }
        return;
    }

    public static int MaxUtil(int[] st, int ss,int se, int l,int r, int node){

        // If segment of this node is completely
        // part of given range, then return
        // the max of segment
        if (l <= ss && r >= se)
            return st[node];

        // If segment of this node does not
        // belong to given range
        if (se < l || ss > r)
            return -1;

        // If segment of this node is partially
        // the part of given range
        int mid = getMid(ss, se);

        return Math.max(
        MaxUtil(st, ss, mid, l, r,2 * node + 1),
        MaxUtil(st, mid + 1, se, l, r,2 * node + 2));
    }


}
