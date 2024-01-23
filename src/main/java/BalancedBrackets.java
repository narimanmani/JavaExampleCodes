
import java.util.Stack;
//Java Program To Check For Balanced Brackets In An Expression (Well-Formedness) Using Stack
public class BalancedBrackets {

    public static void main(String[] args) {
        // Sample expressions
        String[] expressions = {
                "([{}])",      // Balanced
                "(]",          // Not balanced
                "({[]})",      // Balanced
                "((()",        // Not balanced
                "{[()()]}",    // Balanced
                "{[(])}",      // Not balanced
                "",            // Balanced (empty string)
                "([)]",        // Not balanced
                "([])",        // Balanced
                "({})",        // Balanced
        };

        // Testing each expression
        for (String expr : expressions) {
            if (areBracketsBalanced(expr))
                System.out.println("'" + expr + "' is Balanced");
            else
                System.out.println("'" + expr + "' is Not Balanced");
        }
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