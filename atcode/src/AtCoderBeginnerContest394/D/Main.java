package AtCoderBeginnerContest394.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String STmp = sc.nextLine();
        char S[] = new char[STmp.length()];

        for (int i = 0; i < STmp.length(); i++) {
            S[i] = STmp.charAt(i);
        }

        int skipiBlank = 0;
        for (int i = 0; i < STmp.length() - 1; i++) {
            switch (S[i]) {
                case '(':
                    if (S[i + 1 + skipiBlank] == ')') {
                        S[i] = ' ';
                        S[i+1+skipiBlank] = ' ';
                        if(i!=0){
                            i -= 2;
                        }
                        skipiBlank += 2;
                    }else{
                        skipiBlank = 0;
                    }
                    break;
                case '[':
                    if (S[i + 1 + skipiBlank] == ']') {
                        S[i] = ' ';
                        S[i+1+skipiBlank] = ' ';
                        if(i!=0){
                            i -= 2;
                        }
                        skipiBlank += 2;
                    }else{
                        skipiBlank = 0;
                    }
                    break;
                case '<':
                    if (S[i + 1 + skipiBlank] == '>') {
                        S[i] = ' ';
                        S[i+1+skipiBlank] = ' ';
                        if(i!=0){
                            i -= 2;
                        }
                        skipiBlank += 2;
                    }else{
                        skipiBlank = 0;
                    }
                    break;
                default:
                    skipiBlank = 0;
                    break;
            }
        }

        for(int i=0; i<S.length; i++){
            if(S[i] != ' '){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");

    }
}
