package behavioralPattern.oberserverPattern.observable_publisher;

import behavioralPattern.oberserverPattern.observer_subscriber.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
