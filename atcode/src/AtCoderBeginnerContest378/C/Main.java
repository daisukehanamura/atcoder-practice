package AtCoderBeginnerContest378.C;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];
        Map<Integer, Integer> keyMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = -1;

            if (keyMap.get(A[i]) == null) {
                keyMap.put(A[i], i);
            } else {
                B[i] = keyMap.get(A[i]) + 1;
                keyMap.replace(A[i], i);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
