package factory;

public class NYStylePepperoniPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing NYStylePepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("baking NYStylePepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting NYStylePepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("boxing NYStylePepperoniPizza");
    }
}
