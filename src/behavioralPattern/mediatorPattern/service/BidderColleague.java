package behavioralPattern.mediatorPattern.service;

public interface BidderColleague {
    void placeBid(int bidAmount);
    void receiveNotification(int bidAmount);
    String getName();
}
