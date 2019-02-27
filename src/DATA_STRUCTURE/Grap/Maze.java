package DATA_STRUCTURE.Grap;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {

    static int M,N,dx,dy,gx,gy;
    static char[][] a;
    static int[][] deep;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入迷宫的行数:");
        M = sc.nextInt();
        System.out.println("请输入迷宫的列数：");
        N = sc.nextInt();
        a = new char[M][N];
        deep = new int[M][N];
        System.out.println("请输入迷宫矩阵（起点为'm',终点为'e'，墙壁为'1',可行路径为'0'");
        for (int i=0;i<M;i++){
            a[i] = sc.next().toCharArray();
        }
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                if (a[i][j]=='m'){
                    dx = i;
                    dy = j;
                }
                if (a[i][j]=='e'){
                    gx = i;
                    gy = j;
                }
            }
        }
        int len = bfs();
        System.out.println("从起点到终点的最短路径为:"+len);
    }
    private static int bfs(){
        Queue<Point> q = new LinkedList<Point>();
        int[] tx = {-1,1,0,0};
        int[] ty = {0,0,1,-1};
        q.offer(new Point(dx,dy));

        for (int i=0;i<M;i++){
            for (int j = 0;j<N;j++){
                deep[i][j] = -1;
            }
        }
        deep[dx][dy] = 0;

        while (q.size()>0) {
            Point p = q.poll();
            if (p.x == gx && p.y == gy)
                break;
            for (int i = 0; i < 4; i++) {
                int x = p.x + tx[i];
                int y = p.y + ty[i];
                if (x >= 0 && x < M && y >= 0 && y < N && a[x][y] != '1' && deep[x][y] == -1) {
                    deep[x][y] = deep[p.x][p.y] + 1;
                    q.offer(new Point(x, y));
                }
            }

        }

        return deep[gx][gy];
    }
}
