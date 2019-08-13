package designpattern.observerBySys;

import java.util.Observable;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 17:26
 * @Description:
 */
public class ConSubject extends Observable {

    private String data="";


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        if(!this.data.equals(data)) {
            this.data = data;
            setChanged();
        }

        notifyObservers();
    }
}
