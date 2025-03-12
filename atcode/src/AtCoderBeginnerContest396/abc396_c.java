package AtCoderBeginnerContest396;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.stream.IntStream;

public class abc396_c {
        public static void main(String[] args) throws Exception {
            ans();
    }


    private static void ans(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 配列の初期化
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        long[] S = new long[N + 1];    // 累積和が大きくなる可能性があるためlong型
        long[] T = new long[M + 1];
        long[] maxT = new long[M + 1];
        
        // 入力の読み込み
        for (int i = 0; i < N; i++) A.add(sc.nextInt());
        for (int i = 0; i < M; i++) B.add(sc.nextInt());
        
        // 降順ソート
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());
        
        // 累積和の計算
        for (int i = 0; i < N; i++) {
            S[i + 1] = S[i] + A.get(i);
        }
        
        // 累積和と最大値の計算
        for (int i = 0; i < M; i++) {
            T[i + 1] = T[i] + B.get(i);
            maxT[i + 1] = Math.max(maxT[i], T[i + 1]); // その地点で選ばれる最大値も持っておく
        }
        
        // 答えの計算
        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans = Math.max(ans, S[i] + maxT[Math.min(i, M)]);
        }
        
        System.out.println(ans);
        sc.close();
    }

    private void firstAns(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> B = new ArrayList<>();
        List<Integer> W = new ArrayList<>();
        
        for(int i=0; i< N; i++){
            B.add(sc.nextInt());
        }

        for(int i=0; i< M; i++){
            W.add(sc.nextInt());
        }

        Collections.sort(B, Collections.reverseOrder());
        Collections.sort(W, Collections.reverseOrder());


        List<Integer> BSum = new ArrayList<>();
        List<Integer> WSum = new ArrayList<>();

        BSum = IntStream.range(0, B.size())
        .mapToObj(i -> B.subList(0, i + 1).stream().reduce(0, Integer::sum))
        .collect(Collectors.toList());
        
        int sum = 0;
        for (int num : B) {
            sum += num;
            BSum.add(sum);
        }

        sum = 0;
        for (int num : W) {
            sum += num;
            WSum.add(sum);
        }
        
        BSum.forEach(x -> System.out.print(x + " "));
    }
}
