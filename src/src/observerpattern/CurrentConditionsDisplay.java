package observerpattern;

public class CurrentConditionsDisplay implements Observer{

    private int humidity;
    private int temp;

    public CurrentConditionsDisplay(Subject weatherStation){
        weatherStation.registerObserver( this);
    }

    @Override
    public void update(int humidity, int temp) {
        this.temp =temp;
        this.humidity = humidity;
        displayCurrent();
    }

    public void displayCurrent(){
        System.out.println("Current temp: " + temp);
        System.out.println("Current humidity: "+ humidity);
    }
}
