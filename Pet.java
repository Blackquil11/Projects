public class Pet {
    private String name;

    
    public Pet() {
        this.setName("Pet Name");
    }

    
    public void setName(String n) {
        name = n;
    }

    
    public String getName() {
        return name;
    }

    
    public String toString() {
        return "Pet information:\nName: " + name;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet();
        pet2.setName("George");
        System.out.println(pet2.toString());
    }
}
