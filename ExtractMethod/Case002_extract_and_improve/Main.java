public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        printQuotient(x, y);
    }

    public static void printQuotient(int x, int y) {
        if (y != 0) {
            int result = x / y;
            System.out.println("Quotient: " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
