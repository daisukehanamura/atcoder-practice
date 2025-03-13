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

        for(int i=1; i<S.length; i++){
            if(S[i-1] == 'W' && S[i] == 'A'){
                S[i-1] = 'A';
                S[i] = 'C';

                if(i!=1 && S[i-2]=='W' && S[i-1]=='A'){
                    S[i-2] = 'A';
                    S[i-1] = 'C';
                }
            }
        }

        for(int i=0; i<S.length; i++){
            System.out.print(S[i]);
        }


    }
}
