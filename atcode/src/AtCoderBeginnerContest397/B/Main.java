package AtCoderBeginnerContest397.B;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat();

        if(X >= 38.0){
            System.out.println(1);
        }else if (X >= 37.5 && X < 38.0){
            System.out.println(2);

        }else{
            System.out.println(3);
        }
        
    }

}
