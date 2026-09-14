import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet("Dog", "Buster", 11);
        System.out.println(pet2.toString());

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter animal type: ");
        String type = keyboard.nextLine();
        System.out.println("Enter animal name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter animal age: ");
        int age = Integer.parseInt(keyboard.nextLine());

        Pet pet3 = new Pet(type, name, age);
        System.out.println(pet3.toString());
    }
}
