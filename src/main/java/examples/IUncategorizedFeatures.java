package examples;

public class IUncategorizedFeatures {

    public static void main(String[] args) {
        System.out.println("\nisContainDotPlus():'\\w*\\Q.+\\E\\d*'");
        System.out.println("'dog.+57' -> " + isContainDotPlus("dog.+57"));
        System.out.println("'.+' -> " + isContainDotPlus(".+"));
        System.out.println("'.8+' -> " + isContainDotPlus(".8+"));

        System.out.println("\nisPartInsensitiveHelloWorld():'(?i:hello) World'");
        System.out.println("'Hello World' -> " + isPartInsensitiveHelloWorld("Hello World"));
        System.out.println("'Hello world' -> " + isPartInsensitiveHelloWorld("Hello world"));
        System.out.println("'HELLO World' -> " + isPartInsensitiveHelloWorld("HELLO World"));
    }

    private static boolean isContainDotPlus(String str) {
        return str.matches("\\w*\\Q.+\\E\\d*");
    }

    private static boolean isPartInsensitiveHelloWorld(String str) {
        return str.matches("(?i:hello) World");
    }
}
