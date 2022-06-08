package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer{

    private List<Integer> temp;
    private List<Integer> humidity;

    public ForecastDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this);
        this.temp = new ArrayList<>();
        this.humidity = new ArrayList<>();
    }

    @Override
    public void update(int humidity, int temp) {
         this.humidity.add(humidity);
         this.temp.add(temp);
          display7DayHistory();
    }

    public void display7DayHistory(){
        // iterate through the list and show
    }


}
