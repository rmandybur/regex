package examples;

public class CharacterExpressions {
    public static void main(String[] args) {
        System.out.println("Character classes");
        System.out.println("\n[ace]");
        System.out.println("a -> " + "a".matches("[ace]"));
        System.out.println("A -> " + "A".matches("[ace]"));
        System.out.println("Q -> " + "Q".matches("[ace]"));

        System.out.println("\n[^ace] (negation)");
        System.out.println("a -> " + "a".matches("[^ace]"));
        System.out.println("A -> " + "A".matches("[^ace]"));
        System.out.println("Q -> " + "Q".matches("[^ace]"));

        System.out.println("\n[a-zA-Z] (range)");
        System.out.println("a -> " + "a".matches("[a-zA-Z]"));
        System.out.println("A -> " + "A".matches("[a-zA-Z]"));
        System.out.println("Q -> " + "Q".matches("[a-zA-Z]"));

        System.out.println("\n[a-du-z]");
        System.out.println("a -> " + "a".matches("[a-du-z]"));
        System.out.println("y -> " + "y".matches("[a-du-z]"));
        System.out.println("q -> " + "q".matches("[a-du-z]"));


        System.out.println("\nThe next expressions work only in a few platforms: Java, C#, Ruby, IntellijIDEA\n");
        System.out.println("[a-z&&[def]] (intersection)");
        System.out.println("a -> " + "a".matches("[a-z&&[def]]"));
        System.out.println("d -> " + "d".matches("[a-z&&[def]]"));

        System.out.println("\n[a-z&&[^bc]] (subtraction)");
        System.out.println("a -> " + "a".matches("[a-z&&[^b-d]]"));
        System.out.println("d -> " + "d".matches("[a-z&&[^b-d]]"));
    }
}
