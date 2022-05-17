package examples;

public class GLookaroundExpressionsPartOne {

    public static void main(String[] args) {
        String text = "Candy is delicious or disgusting Candy is delicious or disgusting Candy " +
                "is delicious or disgusting Candy is delicious or disgusting Candy is delicious " +
                "or disgusting Candy is delicious or disgusting Candy is delicious or disgusting Candy" +
                " is delicious or disgusting Candy is delicious or disgusting Candy is delicious or" +
                " disgusting Candy is delicious or disgusting Candy is delicious or disgusting Candy" +
                " is delicious or disgusting Candy is delicious or disgusting Candy is delicious or" +
                " disgusting Candy is delicious or disgusting Candy is delicious or disgusting" +
                " is delicious or disgusting Candy is delicious or disgusting Candy is delicious " +
                "or disgusting Candy is delicious or disgusting Candy is delicious or disgusting Candy" +
                " is delicious or disgusting Candy is delicious or disgusting Candy is delicious or" +
                " disgusting Candy is delicious or disgusting Candy is delicious or disgusting Candy" +
                " is delicious or disgusting Candy is delicious or disgusting Candy is delicious or" +
                " disgusting Candy is delicious or disgusting Candy is delicious or disgusting" +
                " Candy is delicious or disgusting";
        String shortText = "Candy is delicious or disgusting Candy is delicious or disgusting Candy " +
                "is delicious or disgusting";

        long greedyFirst = System.currentTimeMillis();
        System.out.println("Greedy: " + isNumberOfWordsInTextMoreThanTenGreedy(text));
        long greedySecond = System.currentTimeMillis();
        System.out.println("Greedy regex for " + text.length() + " symbols, took " + (greedySecond - greedyFirst) + " nanos.");
        long lazyFirst = System.currentTimeMillis();
        System.out.println("Lazy: " + isNumberOfWordsInTextMoreThanTenLazy(text));
        long lazySecond = System.currentTimeMillis();
        System.out.println("Lazy regex for " + text.length() + " symbols, took " + (lazySecond - lazyFirst) + " nanos.");


        System.out.println("\nGreedy: " + isNumberOfWordsInTextMoreThanTenGreedy(shortText));
        System.out.println("Lazy: " + isNumberOfWordsInTextMoreThanTenLazy(shortText));


    }

    public static boolean isNumberOfWordsInTextMoreThanTenGreedy(String text) {
        return text.matches("(?=(?:[\\w\\- ]*\\b[\\w-]{3,}\\b){10,})(?=(?:[\\w\\- ]*\\bCandy\\b){3,}).*");
    }

    public static boolean isNumberOfWordsInTextMoreThanTenLazy(String text) {
        return text.matches("(?=(?:[\\w\\- ]*?\\b[\\w-]{3,}\\b){10,})(?=(?:[\\w\\- ]*?\\bCandy\\b){3,}).*");
    }
}
