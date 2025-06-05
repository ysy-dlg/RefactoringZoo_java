public class Utils {

    public static void greet(String name) {
        String message = formatMessage(name);
        System.out.println(message);
    }

    private static String formatMessage(String name) {
        return "Hello, " + name;
    }
}
