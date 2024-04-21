package system_design.design_patterns.behavioral.Observer_DP.Observable;

import system_design.design_patterns.behavioral.Observer_DP.Observer.NotificationAlertObserver;

public interface StockObservable {
    void addObserver(NotificationAlertObserver notificationAlertObserver);
    void removeObserver(NotificationAlertObserver notificationAlertObserver);
    void notifyObservers();
    void setData(int data);
    int getData();
}
