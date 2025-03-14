package AtCoderBeginnerContest394.D;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String STmp = sc.nextLine();
        char S[] = new char[STmp.length()];

        for (int i = 0; i < STmp.length(); i++) {
            S[i] = STmp.charAt(i);
        }

        Stack<Character> stack = new Stack<>();
        stack.push(' ');
        Character top = ' ';
        for (int i = 0; i < STmp.length(); i++) {
            if (S[i] == '(' || S[i] == '[' || S[i] == '{') {
                stack.push(S[i]);
            } else {
                switch (S[i]) {
                    case ')':
                        if (top == '(') {
                            stack.pop();
                        } else {
                            stack.push(S[i]);
                        }
                        break;
                    case ']':
                        if (top == '[') {
                            stack.pop();
                        } else {
                            stack.push(S[i]);
                        }
                        break;
                    case '}':
                        if (top == '{') {
                            stack.pop();
                        } else {
                            stack.push(S[i]);
                        }
                        break;
                }
            }
            top = stack.peek();
        }
        if(stack.size()==1){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
