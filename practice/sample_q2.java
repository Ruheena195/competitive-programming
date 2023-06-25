import java.util.*;

public class sample_q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            Queue<int[]> maxHeap = new PriorityQueue<>((a,b)-> (a[0]==b[0])? b[1]-a[1]:b[0]-a[0]);
            Queue<int[]> minHeap = new PriorityQueue<>((a,b)-> (a[0]==b[0])? a[1]-b[1]:a[0]-b[0]);
            int score=0;

            do{
                score = sc.nextInt();

                if(score > 0){
                    int time = sc.nextInt();
                    int rollno = sc.nextInt();
                    
                    valueAdd(new int[]{score,time,rollno},maxHeap,minHeap);
                    // System.out.println("MinHeap = "+minHeap);
                    // System.out.println("MaxHeap = "+maxHeap);
                    
                }
                else if(score==-1){
                    if(!maxHeap.isEmpty()){
                        System.out.println(maxHeap.peek()[2]);
                        maxHeap.remove();

                        if(!minHeap.isEmpty()){
                            // int[] temp1 = maxHeap.remove();
                            // int[] temp2 = minHeap.remove();
                            // valueAdd(temp2,maxHeap,minHeap);
                            // valueAdd(temp1,maxHeap,minHeap);
                            maxHeap.add(minHeap.remove());
                            // System.out.println("MinHeap = "+minHeap);
                            // System.out.println("MaxHeap = "+maxHeap);
                        }
                        // if(maxHeap.isEmpty() && minHeap.size()>0)
                        //     maxHeap.add(minHeap.remove());
                            
                    }    
                }

            }while(score!=0);
        }
    }

    public static void valueAdd(int[] arr,Queue<int[]> maxHeap, Queue<int[]> minHeap){
        if (maxHeap.size() == minHeap.size()) {
            minHeap.add(arr);
            maxHeap.add(minHeap.remove());
        } else if (maxHeap.size() > minHeap.size()) {
            maxHeap.add(arr);
            minHeap.add(maxHeap.remove());
        }

    }
    
}
