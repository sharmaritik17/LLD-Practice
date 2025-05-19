package behavioralPattern.mediatorPattern.mediator;

import behavioralPattern.mediatorPattern.service.BidderColleague;

public interface AuditorMediator {
    void addBidder(BidderColleague bidderColleague);
    void placeBid(BidderColleague bidderColleague, int bidAmount);
}
