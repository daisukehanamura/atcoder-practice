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
        Map<Integer,Integer> KeyCount = new HashMap<>();


        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();

            if(KeyCount.get(A[i]) == null){
                KeyCount.put(A[i],1);
            }else{
                KeyCount.replace(A[i],KeyCount.get(A[i])+1);
            }

            B[i] = -1;
            for(int j=1; j<=i; j++){
                if(KeyCount.get(A[i]) == 1){   
                    break;
                }
                if(A[i] == A[i-j]){
                    B[i] = i-j+1;
                    break;
                }
            }
        }

        // for(int i=1; i<N; i++){

        // }

        for(int i=0; i<N; i++){
            System.out.print(B[i] + " ");
        }

    }

}
