package system_design.design_patterns.behavioral.Observer_DP.Observable;

import system_design.design_patterns.behavioral.Observer_DP.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    List<NotificationAlertObserver> observers = new ArrayList<>();

    private int stock = 0;

    @Override
    public void addObserver(NotificationAlertObserver notificationAlertObserver) {
        observers.add(notificationAlertObserver);
    }

    @Override
    public void removeObserver(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void setData(int stock) {
        if (this.stock == 0 && stock > 0) {
            notifyObservers();
        }
        this.stock += stock;
    }

    @Override
    public int getData() {
        return stock;
    }
}
