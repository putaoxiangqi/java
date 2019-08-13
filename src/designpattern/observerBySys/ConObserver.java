package designpattern.observerBySys;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 17:31
 * @Description:
 */
public class ConObserver implements Observer {


    public ConObserver(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        ConSubject conSubject = (ConSubject) o;
        System.out.println("o = " + conSubject.getData());
    }
}
