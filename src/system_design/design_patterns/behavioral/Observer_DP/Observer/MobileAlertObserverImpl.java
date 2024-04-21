package system_design.design_patterns.behavioral.Observer_DP.Observer;

import system_design.design_patterns.behavioral.Observer_DP.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    private String userName;
    private StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsg();
    }


    public void sendMsg() {
        System.out.println("msg sent to : " + userName);
    }
}
