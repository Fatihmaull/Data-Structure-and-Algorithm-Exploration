import java.util.Stack;

public class InfixToPostfix {
    // Fungsi untuk mengembalikan prioritas operator
    static int getPriority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Fungsi untuk mengonversi infix ke postfix
    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // Jika karakter adalah operand, tambahkan ke hasil
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // Jika karakter adalah '(', push ke stack
            else if (c == '(') {
                stack.push(c);
            }
            // Jika karakter adalah ')', pop dari stack sampai menemukan '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // Jika operator, cek prioritas
            else {
                while (!stack.isEmpty() && getPriority(c) <= getPriority(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop semua operator yang tersisa di stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String ekspresi = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix: " + infixToPostfix(ekspresi));
    }
}
