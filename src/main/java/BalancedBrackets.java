
import java.util.Stack;
//Java Program To Check For Balanced Brackets In An Expression (Well-Formedness) Using Stack
public class BalancedBrackets {

    public static void main(String[] args) {
        String expr = "([{})";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
    // Function to check if brackets are balanced
    public static boolean areBracketsBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening bracket, then it must be closing.
            // So stack cannot be empty at this point.
            if (stack.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check if stack is empty
        return (stack.isEmpty());
    }
}