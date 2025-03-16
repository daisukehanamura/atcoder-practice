import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int count =0;
        char nowChara = 'i';
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) != nowChara){
                count++;
                if(nowChara == 'o'){
                    nowChara = 'i';
                }else{
                    nowChara = 'o';
                }
            }
            if(nowChara == 'o'){
                nowChara = 'i';
            }else{
                nowChara = 'o';
            }
        }

        if(S.charAt(S.length()-1) == 'i'){
            count++;
        }

        System.out.println(count);
        
    }

}
