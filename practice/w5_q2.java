import java.util.*;

public class w5_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        Queue<int[]> maxHeap, minHeap;

        while(t-- > 0){
            maxHeap = new PriorityQueue<>((a,b)-> (a[0]==b[0])? b[1]-a[1]:b[0]-a[0]);
            minHeap = new PriorityQueue<>((a,b)-> (a[0]==b[0])? a[1]-b[1]:a[0]-b[0]);
            int score=0;

            do{
                score = sc.nextInt();

                if(score > 0){
                    int time = sc.nextInt();
                    int rollno = sc.nextInt();
                    
                    add(new int[]{score,time,rollno},maxHeap,minHeap);
                }
                else if(score==-1){
                    if(!maxHeap.isEmpty()){
                        System.out.println(maxHeap.peek()[2]);
                        maxHeap.remove();

                        if(!maxHeap.isEmpty() && !minHeap.isEmpty()){
                            int[] temp1 = maxHeap.remove();
                            int[] temp2 = minHeap.remove();
                            add(temp2,maxHeap,minHeap);
                            add(temp1,maxHeap,minHeap);
                        }
                    }    
                }

            }while(score!=0);
        }
    }

    public static void add(int[] arr,Queue<int[]> maxHeap, Queue<int[]> minHeap){
        if (maxHeap.size() == minHeap.size()) {
            minHeap.add(arr);
            maxHeap.add(minHeap.remove());
        } else if (maxHeap.size() > minHeap.size()) {
            maxHeap.add(arr);
            minHeap.add(maxHeap.remove());
        }

    }

    public static int searchIndex(List<int[]> lt, int score, int time){

        int low=0,high=lt.size()-1;

        while(low<=high){
            int val = low + (high-low)/2;
            int[] mid = lt.get(val);

            if(score < mid[0])
                high = val;
            
            else if(score > mid[0]) 
                low = val+1;

            else{
                if(time < mid[1])
                high = val;
            
            else if(time > mid[1]) 
                low = val+1;

            }
        }
        return low;

    }    
}
