public class Dog extends Animal {
    String name;
    private final int runRestriction = 500;
    private final int swimRestriction = 10;
    public Dog(String DogName){
    name = DogName;
    }
    public Dog(){}

    @Override
    public void run(int x) {
        if (x<=runRestriction) {
            System.out.println(name + " ran for " + x + " metres");
        } else {
            System.out.println(name + " can't run this much");
        }
    }

    @Override
    public void swim(int y) {
        if (y<=swimRestriction) {
            System.out.println(name + " swam for " + y + "metres");
        } else {
            System.out.println(name + " can't swim this much");
        }
    }
}
