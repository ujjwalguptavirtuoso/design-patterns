package strategypatterm;

public class MallardDuck extends Duck{


    public MallardDuck(FlyBehaviour fb) {
        super(fb);
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
