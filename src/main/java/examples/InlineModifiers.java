package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InlineModifiers {

    public static void main(String[] args) {
        System.out.println("\nisCaseInsensitiveMatch():'(?i)'");
        System.out.println("'Binariks' and 'bInariks' -> " + isCaseInsensitiveMatch("Binariks", "bInariks"));
        System.out.println("'hell' and 'HELL' -> " + isCaseInsensitiveMatch("hell", "HELL"));
        System.out.println("BUT Cyrillic doesn't work \n'Бінарікс' and 'БінаРІКС' -> " + isCaseInsensitiveMatch("Бінарікс", "БінаРІКС"));

        System.out.println("\nhello\\nhello: (?s)");
        System.out.println("'.*' -> " + "hello\nhello".matches(".*"));
        System.out.println("'(?s).*' -> " + "hello\nhello".matches("(?s).*"));

        System.out.println("\nMultiline Mode(?m). Text: Hello\\nHello\\nHello");
        multilineMode();

        System.out.println("\nFree spacing Mode(?x). isEmail()");
        freeSpacingMode();
    }

    private static boolean isCaseInsensitiveMatch(String str1, String str2) {
        return str1.matches("(?i)" + str2);
    }

    private static void multilineMode() {
        Pattern simplePattern = Pattern.compile("(^Hello)");
        Pattern multilinePattern = Pattern.compile("(?m)(^Hello)");
        String text = "Hello\nHello\nHello";
        handleMatcher(simplePattern.matcher(text));
        handleMatcher(multilinePattern.matcher(text));
    }
    private static void handleMatcher(Matcher matcher) {
        System.out.println("pattern: " + matcher.pattern().pattern());
        System.out.println("matches:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void freeSpacingMode() {
        System.out.println("somehow@gmail.com -> " + isEmail("somehow@gmail.com"));
        System.out.println("r.mandybur@binariks.com -> " + isEmail("r.mandybur@binariks.com"));
        System.out.println("rmandybur_r36@v.com -> " + isEmail("rmandybur_r36@v.com"));

    }

    private static boolean isEmail(String email) {
        return email.matches("(?x)# Free-spacing mode\n" +
                                    "^# Assert that position = beginning of string\n" +
                                    "[\\w-\\.]+# username of email address\n" +
                                    "@# @ sumbol\n" +
                                    "\\w+# domain name of email address\n" +
                                    "\\.# dot between domain name and domain extension\n" +
                                    "[a-z]{2,6}# domain extension\n" +
                                    "$# Assert that position = ending of string");
    }
}
