public class Pet {
    private String type;
    private String name;
    private int age;

    public Pet() {
        this.setType("Animal");
        this.setName("Pet Name");
        this.setAge(1);
    }

    public Pet(String type, String name, int age) {
        this.setType(type);
        this.setName(name);
        this.setAge(age);
    }

    public void setType(String t) {
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }

    @Override
    public String toString() {
        return "Pet information:\nType: " + type + "\nName: " + name + "\nSound: " + speak() + "\nAge: " + age;
    }
}
