package Course2;

public class Dog {

    public int weightInPounds = 0;
    
    // Static variable
    public static String scientific_name = "Canis familiaris";

    public Dog(int w) {
        weightInPounds = w;
    }

    // Static method：不須宣告就可以使用，但不能使用該class的變數，ex：x = Math.round(5,6)
    // non-static method：需要宣告一個Dog變數才能使用的method
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("aroooooo!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        } else {
            return d2;
        }
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        } else {
            return d2;
        }
    }

}
