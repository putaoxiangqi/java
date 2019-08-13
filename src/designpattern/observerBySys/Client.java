package designpattern.observerBySys;

/**
 * @author fangchang
 * @date 2019/8/13
 * @Time 17:37
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ConSubject conSubject = new ConSubject();
        ConObserver conObserver = new ConObserver(conSubject);

        conSubject.setData("hi observer! ");
    }
}
