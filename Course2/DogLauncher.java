package Course2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(20);
        Dog d2 = new Dog(30);
        d1.makeNoise();

        // static method
        Dog max = Dog.maxDog(d1, d2);
        max.makeNoise();

        // non-static method
        max = d1.maxDog(d2);
        max.makeNoise();

        System.out.println(Dog.scientific_name);
    }
}
