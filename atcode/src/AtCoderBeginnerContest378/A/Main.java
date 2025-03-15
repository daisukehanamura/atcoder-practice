package AtCoderBeginnerContest378.A;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static String WA = "WA";

    public static String AC = "AC";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[4];
        int ans = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;


        for(int i=0; i<4; i++){
            int N = sc.nextInt();
            switch(N){
                case 1:
                    a1++;
                    break;
                case 2:
                    a2++;
                    break;
                case 3:
                    a3++;
                    break;
                case 4:
                    a4++;
                    break;
            }
        }

        if(a1 == 2 || a1 == 3){
            ans++;
        }else if (a1 == 4){
            ans+=2;
        }

        if(a2 == 2 || a2 == 3){
            ans++;
        }else if (a2 == 4){
            ans+=2;
        }

        if(a3 == 2 || a3 == 3){
            ans++;
        }else if (a3 == 4){
            ans+=2;
        }

        if(a4 == 2 || a4 == 3){
            ans++;
        }else if (a4 == 4){
            ans+=2;
        }

        System.out.println(ans);

        
    }

}
