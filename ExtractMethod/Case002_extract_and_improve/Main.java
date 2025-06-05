public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = safeDivide(a, b);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }

    public static int safeDivide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        System.out.println("Dividing " + a + " by " + b);
        return a / b;
    }
}
