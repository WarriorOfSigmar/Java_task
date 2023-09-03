public class Tiger extends Animal {
    String name;
    public Tiger(String TigerName) {
        name = TigerName;
    }
    public Tiger(){}
    @Override
    public void run(int x) {
        System.out.println(name + " ran for " + x + " metres");
    }

    @Override
    public void swim(int y) {
        System.out.println(name + " swam for " + y + " metres");
    }
}
