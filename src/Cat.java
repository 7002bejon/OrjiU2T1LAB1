public class Cat {
    private int age;

    private double weight;

    private String name;

    public Cat(int catAge, double catWeight, String catName) {
        age = catAge;
        weight = catWeight;
        name = catName;
    }

    public void printCatInfo() {
        System.out.println("I am " + age + "years old");
        System.out.println("I am " + weight + "pounds");
        System.out.println("My name is " + name);
    }
    public void introduce() { if(age < 7) {
        System.out.println("Hello, I am" + name + "and I am the younger cat");
    } else {
        System.out.println("Hello, I am" + name + "and I am the older cat");
    }
    }
}
