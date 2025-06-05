public class Utils {

    public static void greet(String name, boolean forceUpper) {
        String message = formatMessage(name, forceUpper);
        System.out.println(message);
    }

    // 🔄 Updated internal call
    private static String formatMessage(String name, boolean forceUpper) {
        String message = "Hello, " + name;
        return forceUpper ? message.toUpperCase() : message;
    }
}
