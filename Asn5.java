import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Maple");
        words.add("Cedar");
        words.add("Birch");
        words.add("Willow");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(24);
        numbers.add(36);
        numbers.add(48);

        System.out.println("String ArrayList:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + words.get(i));
        }

        System.out.println("\nInteger ArrayList:");
        for (Integer number : numbers) {
            System.out.println("  " + number);
        }

        words.remove(1);
        words.set(0, "Oak");
        numbers.remove(1);
        numbers.set(0, 100);

        System.out.println("\nAfter remove() and set():");
        System.out.println("String ArrayList:");
        for (int i = 0; i < words.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + words.get(i));
        }

        System.out.println("Integer ArrayList:");
        for (Integer number : numbers) {
            System.out.println("  " + number);
        }
    }
}
