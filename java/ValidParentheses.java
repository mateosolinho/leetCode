import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // Permite almacenar objetos y luego recuperarlos en el orden inverso en el cual
        // se insertaron, es decir, siempre se recupera el último elemento insertado

        Stack<Character> stack = new Stack<Character>();

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("()"));
    }
}
