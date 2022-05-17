package examples;

public class CQuantifiersExpressions {

    public static void main(String[] args) {
        System.out.println("\nisEmptyOrNumeric():'\\d*'");
        System.out.println("'' -> " + isEmptyOrNumeric(""));
        System.out.println("'5' -> " + isEmptyOrNumeric("5"));
        System.out.println("'567' -> " + isEmptyOrNumeric("567"));

        System.out.println("\nisAWord():'\\w+'");
        System.out.println("'F' -> " + isAWord("F"));
        System.out.println("'Hello' -> " + isAWord("Hello"));
        System.out.println("'Hello_World' -> " + isAWord("Hello_World"));

        System.out.println("\nisEmptyOrSingleCharacter():'.?'");
        System.out.println("'F' -> " + isEmptyOrSingleCharacter("F"));
        System.out.println("'' -> " + isEmptyOrSingleCharacter(""));
        System.out.println("'&' -> " + isEmptyOrSingleCharacter("&"));

        System.out.println("\nisAAAGame():'A{3}'");
        System.out.println("'AAA' -> " + isAAAGame("AAA"));
        System.out.println("'A' -> " + isAAAGame("A"));

        System.out.println("\nisNickname():'\\w{3,}'");
        System.out.println("'SaladEater96' -> " + isNickname("SaladEater96"));
        System.out.println("'Upiter_88' -> " + isNickname("Upiter_88"));
        System.out.println("'mother_killer_1388' -> " + isNickname("mother_killer_1388"));

        System.out.println("\nisShortName():'\\w{3,6}'");
        System.out.println("'Jake' -> " + isShortName("Jake"));
        System.out.println("'Lee' -> " + isShortName("Lee"));
    }

    private static boolean isEmptyOrNumeric(String text) {
        return text.matches("\\d*");
    }

    private static boolean isAWord(String text) {
        return text.matches("\\w+");
    }

    private static boolean isEmptyOrSingleCharacter(String text) {
        return text.matches(".?");
    }

    private static boolean isAAAGame(String type) {
        return type.matches("A{3}");
    }

    private static boolean isNickname(String nickname) {
        return nickname.matches("\\w{3,}");
    }

    private static boolean isShortName(String string) {
        return string.matches("\\w{3,6}");
    }
}
