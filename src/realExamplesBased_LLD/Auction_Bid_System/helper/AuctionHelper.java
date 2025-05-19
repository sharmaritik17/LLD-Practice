package realExamplesBased_LLD.Auction_Bid_System.helper;

import realExamplesBased_LLD.Auction_Bid_System.domain.Auction;
import realExamplesBased_LLD.Auction_Bid_System.domain.Bid;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuctionHelper {
    public static Bid determineWinner(Auction auction) {
        //could use strategy pattern to make strategies + it's manager to figure out which one to use//todo
        List<Bid> bids = auction.getBids();

        Map<Double, Integer> bidFrequency = new HashMap<>();
        for (Bid bid : bids) {
            bidFrequency.put(bid.getAmount(), bidFrequency.getOrDefault(bid.getAmount(), 0) + 1);
        }
        return bids.stream()
                .filter(bid -> bidFrequency.get(bid.getAmount()) == 1)
                .max(Comparator.comparingDouble(Bid::getAmount))
                .orElse(null);
    }
}
