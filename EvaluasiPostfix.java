import java.util.Stack;

public class EvaluasiPostfix {
    // Fungsi untuk mengevaluasi ekspresi postfix
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // Jika karakter adalah angka, push ke stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            // Jika operator, pop dua elemen dari stack, lakukan operasi, lalu push hasilnya
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }

        // Hasil akhir ada di stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String ekspresi = "231*+9-";
        System.out.println("Hasil evaluasi postfix: " + evaluatePostfix(ekspresi));
    }
}
