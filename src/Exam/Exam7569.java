package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Exam7569 {
    
    public static int row;        // 행 크기
    public static int col;        // 열 크기
    public static int height;    // 쌓인박스 크기
    
    public static int count;    // 안익은 토마토 수 
    public static int max_date = Integer.MIN_VALUE;
    
    public static int[][][] tBox;
    
    public static Queue<int[]> queue;    // 익은 토마토들을 담아 놓는다.
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());
        
        tBox = new int[height][row][col];
        queue = new LinkedList<int[]>();
        
        for(int h = 0; h < height; h++) {
            for(int i = 0; i < row; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < col; j++) {
                    tBox[h][i][j] = Integer.parseInt(st.nextToken());
                    
                    if(tBox[h][i][j] == 1) queue.offer(new int[] {h, i, j, 0});
                    else if(tBox[h][i][j] == 0) count += 1;
                }
            }
        }
        
        BFS();
        System.out.println(count > 0 ? -1 : max_date);
        
    }
    
    public static void setTomato(int h, int i, int j, int t) {
        tBox[h][i][j] = 1;
        queue.offer(new int[] {h, i, j, t});
        count -= 1;
    }
    
    public static void BFS() {
        boolean[][][] visited = new boolean[height][row][col];
        
        while(!queue.isEmpty()) {
            int h = queue.peek()[0];
            int i = queue.peek()[1];
            int j = queue.peek()[2];
            int t = queue.peek()[3];
            queue.poll();
            
            if(h < 0 || i < 0 || j < 0) continue;
            if(h >= height || i >= row ||j >= col) continue;
            if(tBox[h][i][j] != 1) continue;
            if(visited[h][i][j]) continue;
            
            visited[h][i][j] = true;
            if(max_date < t) max_date = t;
            
            // 현재 위 아래 안익은 토마토 있는지
            if(h > 0 && tBox[h-1][i][j] == 0) setTomato(h - 1, i, j, t + 1);
            if(h < height-1 && tBox[h+1][i][j] == 0) setTomato(h + 1, i, j, t + 1);
            // 현재 박스 주면 안익은 토마토 있는지
            
            if(i > 0 && tBox[h][i-1][j] == 0) setTomato(h, i - 1, j, t + 1);
            if(i < row - 1 && tBox[h][i+1][j] == 0) setTomato(h, i+1, j, t+1);
            
            if(j > 0 && tBox[h][i][j-1] == 0) setTomato(h, i, j-1, t+1);
            if(j < col - 1 && tBox[h][i][j+1] == 0) setTomato(h, i, j+1, t+1);
        }
    }
}
