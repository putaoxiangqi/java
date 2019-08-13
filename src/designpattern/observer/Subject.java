package designpattern.observer;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 16:41
 * @Description:
 */
public interface Subject {

    void registerObserver(ObserverInterface o);
    void removeObserver(ObserverInterface o);
    void notifyObservers();
}
