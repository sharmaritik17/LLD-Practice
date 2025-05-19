package behavioralPattern.oberserverPattern.observable_publisher.impl;

import behavioralPattern.oberserverPattern.observable_publisher.StocksObservable;
import behavioralPattern.oberserverPattern.observer_subscriber.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservableImpl implements StocksObservable {
    public List<NotificationAlertObserver> subscriberList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        subscriberList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        subscriberList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver notificationAlertObserver : subscriberList) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}