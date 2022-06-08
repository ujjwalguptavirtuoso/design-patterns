package factory;

public class Main {

    public static void main(String[] args) {
         PizzaStore pizzaStore = new NYPizzaStore();
         Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}
