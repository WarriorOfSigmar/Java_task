import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        DomesticCat catBarsik = new DomesticCat("Barsik");
        DomesticCat catJohn = new DomesticCat("John");
        Dog dogSharik = new Dog("Sharik");
        Dog dogCharlie = new Dog("Charlie");
        Dog dogAce = new Dog("Ace");
        Tiger tigerBella = new Tiger("Bella");
        Animal[] animals = new Animal[6];
        animals[0] = catBarsik;
        animals[1] = catJohn;
        animals[2] = dogSharik;
        animals[3] = dogAce;
        animals[4] = dogCharlie;
        animals[5] = tigerBella;
        for(Animal x: animals) {
            x.run(rand.nextInt(1,1001));
            x.swim(rand.nextInt(1, 1001));
            System.out.println();
        }
    }
}
