package examples;

import java.util.Arrays;

public class AnchorsAndBoundariesExpressions {

    public static void main(String[] args) {
        System.out.println("\nisCherCity():'^Чер\\p{L}+'");
        System.out.println("'Черкаси' -> " + isCherCity("Черкаси"));
        System.out.println("'Шостка' -> " + isCherCity("Шостка"));
        System.out.println("'Чернігів' -> " + isCherCity("Чернігів"));

        System.out.println("\nisPhobia():'\\w*phobia$'");
        System.out.println("'claustrophobia' -> " + isPhobia("claustrophobia"));
        System.out.println("'homophobia' -> " + isPhobia("homophobia"));
        System.out.println("'Acrophobia' -> " + isPhobia("Acrophobia"));

        System.out.println("\nsplitWords():'\\b[^\\w-]+\\b'");
        System.out.println("'hello my dear best-friend!' -> " + Arrays.toString(splitWords("hello my dear best-friend!")));

        System.out.println("\nisContainSubstrInsideTheWord():'.*\\B%s\\B.*'");
        System.out.println("'claustrophobia is a phobia' and 'trop' -> " + isContainSubstrInsideTheWord("claustrophobia is a phobia", "trop"));
        System.out.println("'claustrophobia is a phobia' and 'claus' -> " + isContainSubstrInsideTheWord("claustrophobia is a phobia", "claus"));

    }

    private static boolean isCherCity(String str) {
        return str.matches("^Чер\\p{L}+");
    }

    private static boolean isPhobia(String str) {
        return str.matches("\\w*phobia$");
    }

    private static String[] splitWords(String str) {
        return str.split("\\b[^\\w-]+\\b");
    }

    private static boolean isContainSubstrInsideTheWord(String str, String substr) {
        return str.matches(String.format(".*\\B%s\\B.*", substr));
    }

}
