package AtCoderBeginnerContest378.B;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int func[][] = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            int q = sc.nextInt();
            int r = sc.nextInt();
            func[i][0] = q;
            func[i][1] = r;
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int t = sc.nextInt();
            int d = sc.nextInt();

            int a = func[t][0];
            int b = func[t][1];

            boolean isFound = true;
            while (isFound) {
                if (d % a == b) {
                    System.out.println(d);
                    isFound = false;
                } else {
                    int addNum = d % a;
                    if(addNum > b){
                        d+=b-addNum+a;
                    }else{
                        d+=b-addNum;
                    }
                    
                }
            }
        }
    }
}
