package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DLogicalExpressions {

    public static void main(String[] args) {
        System.out.println("\nisDogOrCat():'dog|cat'");
        System.out.println("'dog' -> " + isDogOrCat("dog"));
        System.out.println("'cat' -> " + isDogOrCat("cat"));
        System.out.println("'ant' -> " + isDogOrCat("ant"));

        System.out.println("\nisCherCity():'Чер(?:нігів|каси|нівці)'");
        System.out.println("'Черкаси' -> " + isCherCity("Черкаси"));
        System.out.println("'Шостка' -> " + isCherCity("Шостка"));
        System.out.println("'Чернігів' -> " + isCherCity("Чернігів"));

        System.out.println("\nisContainRepeatableSubstrings():'(\\w*?(\\w{2,})\\w*?(\\2+)\\w*)'");
        System.out.println("'Ananas' -> " + isContainRepeatableSubstrings("Ananas"));
        System.out.println("'MickyMicky' -> " + isContainRepeatableSubstrings("MickyMicky"));
        System.out.println("'Dependencies' -> " + isContainRepeatableSubstrings("Dependencies"));

        System.out.println("\nswitchLovers():'(\\w+) love([s]?) (\\w+)'");
        System.out.println("'People love pets' -> " + switchLovers("People love pets"));
        System.out.println("'John loves music' -> " + switchLovers("John loves Mother"));
        System.out.println("'Anna loves Andriy' -> " + switchLovers("Anna loves Andriy"));


        System.out.println("\nisTheRepeatablePhrase():'(?<first>\\w+)-\\k<first>'");
        System.out.println("'Yoka-Yoka' -> " + isTheRepeatablePhrase("Yoka-Yoka"));
        System.out.println("'hmm-hmm' -> " + isTheRepeatablePhrase("hmm-hmm"));

    }

    private static boolean isDogOrCat(String str) {
        return str.matches("dog|cat");
    }

    private static boolean isCherCity(String str) {
        return str.matches("Чер(?:нігів|каси|нівці)");
    }

    private static boolean isContainRepeatableSubstrings(String str) {
        String regex = "(\\w*?(\\w{2,})\\w*?(\\2+)\\w*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("The word: " + matcher.group(1));
            System.out.println("Repeatable substring: " + matcher.group(2));
        }
        return matcher.matches();
    }

    private static String switchLovers(String str) {
        return str.replaceAll("(\\w+) love([s]?) (\\w+)", "$3 love$2 $1");
    }

    private static boolean isTheRepeatablePhrase(String str) {
        return str.matches("(?<first>\\w+)-\\k<first>");
    }
}
