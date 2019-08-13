package designpattern.observer;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 16:47
 * @Description:
 */
public class CurrentObserver implements ObserverInterface {

    private float temperature;


    public CurrentObserver(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        System.out.println("tempture = " + this.temperature);
    }
}
