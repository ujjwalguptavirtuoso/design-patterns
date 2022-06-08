package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observers = new ArrayList<>();
    int humidity;
    int temp;

    public WeatherStation(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >=0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObersevers() {
        observers.forEach(o ->o.update(humidity, temp));
    }

    public void measurementChanged(int temp, int humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObersevers();
    }
}
