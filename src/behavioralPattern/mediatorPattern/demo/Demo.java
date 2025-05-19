package behavioralPattern.mediatorPattern.demo;

import behavioralPattern.mediatorPattern.mediator.AuditorMediator;
import behavioralPattern.mediatorPattern.mediator.impl.AuditorMediator1;
import behavioralPattern.mediatorPattern.service.BidderColleague;
import behavioralPattern.mediatorPattern.service.impl.BidderColleague1;

public class Demo {
    public static void main(String[] args) {
        AuditorMediator auditorMediatorObj = new AuditorMediator1();
        BidderColleague bidderColleagueObj1 = new BidderColleague1("A", auditorMediatorObj);
        BidderColleague bidderColleagueObj2 = new BidderColleague1("B", auditorMediatorObj);

        bidderColleagueObj1.placeBid(2000);
        bidderColleagueObj2.placeBid(2500);
        bidderColleagueObj1.placeBid(3000);
    }
}
