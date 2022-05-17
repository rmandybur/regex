package examples;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HLookaroundExpressionsPartTwo {

    public static void main(String[] args) {
        System.out.println("captureAllPrices()");
        captureAllPrices("We have bought 5 javelins and every costs 130 000.00 $");
        captureAllPrices("ONLY today you can buy 3 lipsticks by price for 2. It just 14$ or 20,50 USD for 4 goods");

        System.out.println("\n\nfindAllPhoneNumbersInSingleFormat()");
        findAllPhoneNumbersInSingleFormat("Hey Kile, here is my phones: +380687205039, 0964490664, 380 96 503 85 93 and 68 722 50 46");

        System.out.println("\n splitCamelCase():(?<=[a-z])(?=[A-Z])");
        System.out.println("HelloWorld -> " + Arrays.toString(splitCamelCase("HelloWorld")));
        System.out.println("camelCaseText -> " + Arrays.toString(splitCamelCase("camelCaseText")));
    }

    public static void captureAllPrices(String text) {
        Pattern pattern = Pattern.compile("([\\d ]+[.,]?\\d{0,2})(?=[ ]?(?:\\$|USD))");
        Matcher matcher = pattern.matcher(text);
        System.out.println("TEXT: " + text + "\nWe found next price(s):");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    public static void findAllPhoneNumbersInSingleFormat(String text) {
        Pattern pattern = Pattern.compile("(?<=(?:[ +]380)|[0 ]|^)[ ]?((?:[ ]?\\d){9})(?=$|\\D$|\\D{2})");
        Matcher matcher = pattern.matcher(text);
        System.out.println("TEXT: " + text + "\nWe found next phone number(s):");
        while (matcher.find()) {
            System.out.println(matcher.group(1).replaceAll("[ ]", ""));
        }
    }

    public static String[] splitCamelCase(String str) {
        return str.split("(?<=[a-z])(?=[A-Z])");
    }
}
