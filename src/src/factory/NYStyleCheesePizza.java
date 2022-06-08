package factory;

public class NYStyleCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepaing NYStyleCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("baking NYStyleCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting NYStyleCheesePizza");
    }

    @Override
    public void box() {
        System.out.println("boxing NYStyleCheesePizza");
    }
}
