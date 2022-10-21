import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsStack {
    public static void main(String[] args) {
        Stack bStack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sign in to check out");
        String string = scanner.nextLine();
        char sym = '(';
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == sym){
                bStack.push(string.charAt(i));
            }
            if (string.charAt(i) == ')'){
                count ++;
            }
        }
        if (count == bStack.toArray().length){
            System.out.println("Well");
        }else System.out.println("Null");

    }

}
