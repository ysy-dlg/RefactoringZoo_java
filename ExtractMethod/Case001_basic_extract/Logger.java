public class Logger {
    public void logInfo(String msg) {
        printHeader();
        System.out.println("INFO: " + msg);
    }

    private void printHeader() {
        System.out.println("------");
    }
}