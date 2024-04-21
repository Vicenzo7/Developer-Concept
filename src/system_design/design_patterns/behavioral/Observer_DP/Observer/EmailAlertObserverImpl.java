package system_design.design_patterns.behavioral.Observer_DP.Observer;

import system_design.design_patterns.behavioral.Observer_DP.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private String email;
    private StockObservable stockObservable;

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail();
    }


    public void sendEmail() {
        System.out.println("mail sent to : " + email);
    }
}
