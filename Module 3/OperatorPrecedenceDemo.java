public class OperatorPrecedenceDemo {

    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result: " + result1);
        System.out.println("Explanation: Multiplication (5 * 2 = 10) happens before addition (10 + 10 = 20).");
        System.out.println();

        int result2 = (10 + 5) * 2;
        System.out.println("Expression: (10 + 5) * 2");
        System.out.println("Result: " + result2);
        System.out.println("Explanation: Parentheses evaluated first (10 + 5 = 15), then multiplication (15 * 2 = 30).");
        System.out.println();

        int result3 = 20 - 4 / 2 + 3;
        System.out.println("Expression: 20 - 4 / 2 + 3");
        System.out.println("Result: " + result3);
        System.out.println("Explanation: Division (4 / 2 = 2) first, then subtraction and addition from left to right: 20 - 2 + 3 = 21.");
        System.out.println();

        int result4 = 15 % 4 + 2 * 3;
        System.out.println("Expression: 15 % 4 + 2 * 3");
        System.out.println("Result: " + result4);
        System.out.println("Explanation: Modulus (15 % 4 = 3), multiplication (2 * 3 = 6), then addition (3 + 6 = 9).");
        System.out.println();

        int result5 = ((8 + 2) * (5 - 3)) / 2;
        System.out.println("Expression: ((8 + 2) * (5 - 3)) / 2");
        System.out.println("Result: " + result5);
        System.out.println("Explanation: Parentheses first (8+2=10, 5-3=2), multiplication (10*2=20), then division (20/2=10).");
    }
}
