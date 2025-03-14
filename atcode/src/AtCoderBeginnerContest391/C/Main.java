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
        Queue<Integer> ans = new ArrayDeque<>();

        // 鳩の場所
        int pigeon[] = new int[N];
        for(int i=0; i<N; i++){
            pigeon[i] = i;
        }

        // 巣にいる数
        int nest[] = new int[N];
        for(int i=0; i<N; i++){
            nest[i] = 1;
        }
    
        int sum = 0;
        for(int i=0; i<M; i++){
            int queryNum = sc.nextInt();

            // 鳩の移動
            if(queryNum == 1){
                int P = sc.nextInt();
                int H = sc.nextInt();
                // 移動前を減算
                int tmp = pigeon[P-1];
                nest[tmp]--;
                // 移動後を加算
                nest[H-1]++;
                // 鳩の場所を更新
                pigeon[P-1] = H-1;
                // 複数の鳩の場所を更新
                // ①前の場所が１の場合、減算
                // ②後の場所が２の場合、加算
                if(nest[tmp] == 1){
                    sum--;
                }
                if(nest[H-1] == 2){
                    sum++;
                }

            // 重複場所の出力
            }else{
                ans.add(sum);
                //System.out.println(sum);
            }
        }
        
        // stackの中身を出力
        System.out.println("---");
        ans.stream().forEach(System.out::println);
    }

}
