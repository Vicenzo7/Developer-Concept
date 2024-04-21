package system_design.design_patterns.behavioral.Observer_DP;

import system_design.design_patterns.behavioral.Observer_DP.Observable.IphoneObservableImpl;
import system_design.design_patterns.behavioral.Observer_DP.Observer.EmailAlertObserverImpl;
import system_design.design_patterns.behavioral.Observer_DP.Observer.MobileAlertObserverImpl;
import system_design.design_patterns.behavioral.Observer_DP.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {


        IphoneObservableImpl iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("rakesh", iphoneStockObservable);

        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        iphoneStockObservable.setData(10);
        iphoneStockObservable.setStock(0);
        System.out.println();
        iphoneStockObservable.setData(100);

    }
}
