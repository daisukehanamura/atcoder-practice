package AtCoderBeginnerContest391.B;

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
        
        char S[][] = new char[N][N];
        char T[][] = new char[M][M];

		for(int i = 0; i < N; i++) {
			String line = sc.next();
			for(int j = 0; j < N; j++) {
				S[i][j] = line.charAt(j);
			}
		}
		for(int i = 0; i < M; i++) {
			String line = sc.next();
			for(int j = 0; j < M; j++) {
				T[i][j] = line.charAt(j);
			}
		}

        int a=0;
        int b=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(S[i][j] == T[a][b]){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
       
    }

    private void ans(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char matrix1[][] = new char[n][n];
        char matrix2[][] = new char[m][m];

        for(int i = 0; i < n; i++) {
            matrix1[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < m; i++) {
            matrix2[i] = sc.next().toCharArray();
        }

        for(int a = 0; a <= n - m; a++) {
            for(int b = 0; b <= n - m; b++) {

                boolean ok = true;
                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < m; j++) {
                        if(matrix1[i + a][j + b] != matrix2[i][j]) {
                            ok = false;
                            break;
                        }
                    }
                }

                if(ok) {
                    System.out.println((a + 1) + " " + (b + 1));
                    return;
                }
            }
        }
    }

}
