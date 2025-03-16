package AtCoderBeginnerContest397.C;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        
        // 最初に右側の集合を初期化
        for (int i = 0; i < N; i++) {
            // 値があれば加算、なければ１を追加
            right.put(A[i], right.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            // leftに追加
            left.put(A[i], left.getOrDefault(A[i], 0) + 1);
            
            // rightから削除（カウントを減らす）
            int count = right.get(A[i]);
            if (count == 1) {
                right.remove(A[i]);
            } else {
                right.put(A[i], count - 1);
            }
            
            ans = Math.max(ans, left.size() + right.size());
        }

        System.out.println(ans);
    }

}
