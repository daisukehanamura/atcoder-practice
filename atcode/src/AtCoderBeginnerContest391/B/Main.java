package AtCoderBeginnerContest391.C;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static String WA = "WA";

    public static String AC = "AC";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int S[][] = new int[N-1][N-1];
        int T[][] = new int[M-1][M-1];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                S[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<M; i++){
            for(int j=0; j<M; j++){
                T[i][j] = sc.nextInt();
            }
        }

        int Mgyo = 0;
        int Mretu = 0;
        int count = 0;
        // 行で一致している場所を探索
        for(int i=0; i<N; i++){
            if(S[0][i] == T[0][i]){
                count++;
            }else{
                count = 0;
            }
            if(count == M){
                count = 0;
                // 列で一致している場所を探索
                for(int j=0; i<N; j++){
                    if(S[j][0] == T[j][0]){
                        count++;
                    }else{
                        count = 0;
                    }
                    if(count == N){
                        System.out.println(' ' + ' ' + ' ');
                        return;
                    }
                }
            }
        }

        

        
    }

}
