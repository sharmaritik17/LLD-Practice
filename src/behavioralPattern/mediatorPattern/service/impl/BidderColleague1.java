package behavioralPattern.mediatorPattern.service.impl;

import behavioralPattern.mediatorPattern.mediator.AuditorMediator;
import behavioralPattern.mediatorPattern.service.BidderColleague;

public class BidderColleague1 implements BidderColleague {
    String name;
    AuditorMediator auditorMediator;

    public BidderColleague1(String name, AuditorMediator auditorMediator) {
        this.name = name;
        this.auditorMediator = auditorMediator;
        auditorMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auditorMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println("Bidder name : " + name + " got the notification that someone has place bid of: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
