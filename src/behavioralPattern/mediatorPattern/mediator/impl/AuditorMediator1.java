package behavioralPattern.mediatorPattern.mediator.impl;

import behavioralPattern.mediatorPattern.mediator.AuditorMediator;
import behavioralPattern.mediatorPattern.service.BidderColleague;

import java.util.ArrayList;
import java.util.List;

public class AuditorMediator1 implements AuditorMediator {
    List<BidderColleague> bidderColleagueList = new ArrayList<>();

    @Override
    public void addBidder(BidderColleague bidderColleague) {
        bidderColleagueList.add(bidderColleague);
    }

    @Override
    public void placeBid(BidderColleague bidderColleague, int bidAmount) {
        for (BidderColleague colleague : bidderColleagueList) {
            if(!colleague.getName().equals(bidderColleague.getName())) {
                colleague.receiveNotification(bidAmount);
            }
        }
    }
}
