package examples;

public class PredefinedCharacterExpressions {
    public static void main(String[] args) {
        System.out.println("isADigit():'\\d'");
        System.out.println("'6' -> " + isADigit("6"));
        System.out.println("'0' -> " + isADigit("0"));

        System.out.println("\nisNotADigit():'\\D'");
        System.out.println("'.' -> " + isNotADigit("."));
        System.out.println("'a' -> " + isNotADigit("a"));

        System.out.println("\nisAWhitespace():'\\s'");
        System.out.println("' ' -> " + isAWhitespace(" "));
        System.out.println("'\\n' -> " + isAWhitespace("\n"));
        System.out.println("'\\t' -> " + isAWhitespace("\t"));
        System.out.println("'\\r' -> " + isAWhitespace("\r"));
        System.out.println("'\\f' -> " + isAWhitespace("\f"));

        System.out.println("\nisNotAWhitespace():'\\S'");
        System.out.println("'0' -> " + isNotAWhitespace("0"));
        System.out.println("'u' -> " + isNotAWhitespace("u"));

        System.out.println("\nisALetter():'\\w'");
        System.out.println("'a' -> " + isALetter("7"));
        System.out.println("'F' -> " + isALetter("F"));
        System.out.println("'_' -> " + isALetter("_"));

        System.out.println("\nisNotALetter():'\\W'");
        System.out.println("'\\n' -> " + isNotALetter("\n"));
        System.out.println("'.' -> " + isNotALetter("."));
        System.out.println("'&' -> " + isNotALetter("&"));

        System.out.println("\nisACharacter():'.'");
        System.out.println("'\\n' -> " + isACharacter("\n"));
        System.out.println("' ' -> " + isACharacter(" "));
        System.out.println("'.' -> " + isACharacter("."));
        System.out.println("'&' -> " + isACharacter("&"));
        System.out.println("'7' -> " + isACharacter("7"));
        System.out.println("'g' -> " + isACharacter("g"));
    }

    private static boolean isADigit(String character) {
        return character.matches("\\d");
    }

    private static boolean isNotADigit(String character) {
        return character.matches("\\D");
    }

    private static boolean isAWhitespace(String character) {
        return character.matches("\\s");
    }

    private static boolean isNotAWhitespace(String character) {
        return character.matches("\\S");
    }

    private static boolean isALetter(String character) {
        return character.matches("\\w");
    }

    private static boolean isNotALetter(String character) {
        return character.matches("\\W");
    }

    private static boolean isACharacter(String character) {
        return character.matches(".");
    }
}
