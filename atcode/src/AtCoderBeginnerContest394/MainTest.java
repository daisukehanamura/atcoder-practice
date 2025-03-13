package AtCoderBeginnerContest394;

import java.util.Scanner;

public class MainTest {

    public static String WA = "WA";

    public static String AC = "AC";

    public static void main(String[] args) throws Exception {
        mainTest("WWWCWA");
        mainANS("WWWCWA");
        System.out.println("-----");
        
    }

    private static void mainTest(String STmp) {
        char S[] = new char[STmp.length()];

        for (int i = 0; i < STmp.length(); i++) {
            S[i] = STmp.charAt(i);
        }

        int renzokuW = 0;
        for (int i = 1; i < S.length; i++) {
            if(S[i - 1] == 'W') {
                renzokuW++;
            }else{
                renzokuW = 0;
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

        System.out.println("入力値：" + STmp);
        System.out.print("出力値：");
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i]);
        }
        System.out.println();
    }

    private static void mainANS(String STmp) {
        char[] c = new char[STmp.length()+5];
        for(int i=0; i<STmp.length(); i++){
            c[i+1] = STmp.charAt(i);
        }
        for(int i=1; i<STmp.length(); i++){
            if(c[i]=='W'&&c[i+1]=='A'){
                c[i] = 'A';
                c[i+1] = 'C';
                i-=2;
            }
        }

        System.out.println("入力値：" + STmp);
        System.out.print("出力値：");
        for(int i=1; i<=STmp.length(); i++){
            System.out.print(c[i]);
        }
        System.out.println();
    }
}
