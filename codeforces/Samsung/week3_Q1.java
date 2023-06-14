import java.util.*;


public class week3_Q1 {
    public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
            int[][] arr = new int[10][10];

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            int b11 = sc.nextInt();
            int b12 = sc.nextInt();
            int b21 = sc.nextInt();
            int b22 = sc.nextInt();

            int M = sc.nextInt();
            int[][] asteroids = new int[M][2];

            for(int i=0;i<M;i++){
                asteroids[i][0] = sc.nextInt();
                asteroids[i][1] = sc.nextInt();
                arr[asteroids[i][0]][asteroids[i][1]] = 1;
            }

            int S_to_BH1 = findMinDistance(arr,x1,y1,b11,b12,asteroids);
            int S_to_BH2 = findMinDistance(arr,x1,y1,b21,b22,asteroids);
            int BH1_to_D = findMinDistance(arr,b11,b12,x2,y2,asteroids);
            int BH2_to_D = findMinDistance(arr,b21,b22,x2,y2,asteroids);
            int S_to_D = findMinDistance(arr,x1,y1,x2,y2,asteroids);
            
            int dist1 = (S_to_BH1 == -1 || BH2_to_D == -1)? -1 : S_to_BH1+BH2_to_D;
            int dist2 = (S_to_BH2 == -1 || BH1_to_D == -1)? -1 : S_to_BH2+BH1_to_D;
            
            if(dist1 != -1 ) {
                if(dist2 != -1){
                    System.out.println((S_to_D != -1)? Math.min(dist1, Math.min(dist2,S_to_D)) : Math.min(dist1,dist2));
                }
                else{
                    System.out.println((S_to_D != -1)? Math.min(dist1,S_to_D) : dist1);
                }
            }
            else{
                if(dist2 != -1){
                    System.out.println((S_to_D != -1)? Math.min(dist2,S_to_D) : dist2);
                }
                else{
                    System.out.println((S_to_D != -1)? S_to_D : -1);
                }             
            }


		}
	} 
    
    public static int findMinDistance(int[][] arr, int x1,int y1,int x2,int y2,int[][] asteroids){

        Queue<int[]> q = new LinkedList<>();
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] visit = new boolean[10][10];

        q.add(new int[]{x1,y1,0});
        

        while(!q.isEmpty()){
                
            int[] curr = q.poll();
                
            if(curr[0]==x2 && curr[1]==y2)
                return curr[2];
                
            for(int[] d : dir )  {
                int x = curr[0]+ d[0];
                int y = curr[1]+ d[1];
                        
                if(x>=0 && y>=0 && x<10 && y<10 && arr[x][y]==0 && !visit[x][y]){
                    q.add(new int[]{x,y,curr[2]+1});
                    visit[x][y]=true;
                }
            }
        }                   

        return -1;
    }
}
