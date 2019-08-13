package designpattern.observer;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 16:48
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentObserver currentObserver1 = new CurrentObserver(weatherData);
        CurrentObserver currentObserver2 = new CurrentObserver(weatherData);
        CurrentObserver currentObserver3 = new CurrentObserver(weatherData);


        weatherData.setData(1.1f);
    }
}
