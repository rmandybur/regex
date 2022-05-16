package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookaroundExpressionsPartTwo {

    public static void main(String[] args) {
        captureAllPrices("We have bought 5 javelins and every costs 130 000.00 $");
        captureAllPrices("ONLY today you can buy 3 lipsticks by price for 2. It just 14$ or 20,50 USD for 4 goods");
        findAllPhoneNumbersInSingleFormat("Hey Kile, here is my phones: +380687205039, 0964490664, 380 96 503 85 93 and 68 722 50 46");
    }

    public static void captureAllPrices(String text) {
        Pattern pattern = Pattern.compile("([\\d ]+[.,]?\\d{0,2})(?=[ ]?(?:\\$|USD))");
        Matcher matcher = pattern.matcher(text);
        System.out.println(text + "\nWe found next price(s):");
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    public static void findAllPhoneNumbersInSingleFormat(String text) {
        Pattern pattern = Pattern.compile("(?<=(?:[ +]380)|[0 ]|^)[ ]?((?:[ ]?\\d){9})(?=$|\\D{2})");
        Matcher matcher = pattern.matcher(text);
        System.out.println(text + "\nWe found next phone number(s):");
        while (matcher.find()) {
            System.out.println(matcher.group(1).replaceAll("[ ]", ""));
        }
    }
}