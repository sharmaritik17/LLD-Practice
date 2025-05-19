package realExamplesBased_LLD.Auction_Bid_System.service;

import realExamplesBased_LLD.Auction_Bid_System.domain.Auction;
import realExamplesBased_LLD.Auction_Bid_System.domain.Buyer;

public interface AuctionService {
    void createAuction(Auction auction);
    String closeAuction(String auctionId);
    void placeBid(String auctionId, Buyer buyer, double amount);
    void withdrawBid(String auctionId, String buyerId);
    Auction getAuctionDetails(String auctionId);
}
