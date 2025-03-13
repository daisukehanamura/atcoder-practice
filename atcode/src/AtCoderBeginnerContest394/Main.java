package AtCoderBeginnerContest394;

import java.util.Scanner;

public class Main {

    public static String WA = "WA";

    public static String AC = "AC";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String STmp = sc.nextLine();
        char S [] = new char[STmp.length()];

        for(int i=0; i<STmp.length(); i++){
            S[i] = STmp.charAt(i);
        }

        int renzokuW = 0;
        for (int i = 1; i < S.length; i++) {
            if(S[i - 1] == 'W') {
                renzokuW++;
            } 

            if (S[i - 1] == 'W' && S[i] == 'A') {
                S[i] = 'C';

                for(int j=1; j<renzokuW; j++) {
                    S[i - j] = 'C';
                }
                S[i-renzokuW] = 'A';
                renzokuW = 0;
            }
        }

        for(int i=0; i<S.length; i++){
            System.out.print(S[i]);
        }


    }
}
