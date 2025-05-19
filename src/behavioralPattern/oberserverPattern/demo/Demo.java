package behavioralPattern.oberserverPattern.demo;

import behavioralPattern.oberserverPattern.observable_publisher.StocksObservable;
import behavioralPattern.oberserverPattern.observable_publisher.impl.AndroidObservableImpl;
import behavioralPattern.oberserverPattern.observable_publisher.impl.IphoneObservableImpl;
import behavioralPattern.oberserverPattern.observer_subscriber.NotificationAlertObserver;
import behavioralPattern.oberserverPattern.observer_subscriber.impl.EmailAlertObserverImpl;
import behavioralPattern.oberserverPattern.observer_subscriber.impl.MobileAlertObserverImpl;

public class Demo {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        StocksObservable androidStockObservable = new AndroidObservableImpl();


        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("dummy");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("xyz@gmail.com");
        NotificationAlertObserver observer5 = new EmailAlertObserverImpl("qwe@gmail.com");
        NotificationAlertObserver observer6 = new MobileAlertObserverImpl("damn");

        androidStockObservable.add(observer4);
        androidStockObservable.add(observer5);
        androidStockObservable.add(observer6);

        androidStockObservable.setStockCount(10);
    }
}
