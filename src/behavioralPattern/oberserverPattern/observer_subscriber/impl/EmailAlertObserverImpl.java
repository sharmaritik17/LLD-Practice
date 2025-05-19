package behavioralPattern.oberserverPattern.observer_subscriber.impl;

import behavioralPattern.oberserverPattern.observer_subscriber.NotificationAlertObserver;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    public String emailId;

    public EmailAlertObserverImpl(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMessage(emailId, " product is in stock, hurry up!");
    }

    private void sendMessage(String emailId, String msg) {
        System.out.println("email sent to " + emailId);
        //send the actual email to end user
    }
}
