package behavioralPattern.oberserverPattern.observer_subscriber.impl;

import behavioralPattern.oberserverPattern.observer_subscriber.NotificationAlertObserver;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    public String userName;

    public MobileAlertObserverImpl(String userName) {
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMessage(userName, " product is in stock, hurry up!");
    }

    private void sendMessage(String userName, String msg) {
        System.out.println("sms sent to " + userName);
        //send the actual sms to end user
    }
}
