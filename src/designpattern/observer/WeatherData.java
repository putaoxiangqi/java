package designpattern.observer;

import java.util.ArrayList;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 16:43
 * @Description:
 */
public class WeatherData implements Subject {


    private ArrayList observers;
    private float temperature;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(ObserverInterface o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(ObserverInterface o) {
        int i = observers.indexOf(o);
        if(i>=0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size();++i) {
            ObserverInterface o = (ObserverInterface) observers.get(i);
            o.update(temperature);
        }
    }


    public void setData(float temp) {
        this.temperature = temp;
        notifyObservers();
    }

}
