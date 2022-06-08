package strategypatterm;

public abstract class Duck  {

    protected FlyBehaviour flyBehaviour;

    public Duck(FlyBehaviour fb){
        this.flyBehaviour = fb;
    }

    void display(){
        System.out.println("I am a duck");
    }

    void swim(){
        System.out.println("I can swim");
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
