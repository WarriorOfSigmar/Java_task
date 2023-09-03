public class DomesticCat extends Animal {
    private final int runRestriction = 1000;
    private final int swimRestriction = 0;
    String name;
    public DomesticCat(String nameCat) {
        name = nameCat;
    }
    public DomesticCat() {}
   @Override
   public void run(int x) {
        if (x<=runRestriction) {
            System.out.println(name + " ran for " + x + " metres");
        } else {
            System.out.println(name + " can't run this much");
        }
    }
    public void swim(int y) {
        if (y != swimRestriction) {
            System.out.println(name + " can't swim");
        }
    }
}

