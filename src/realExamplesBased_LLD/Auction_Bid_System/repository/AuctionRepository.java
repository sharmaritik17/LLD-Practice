package realExamplesBased_LLD.Auction_Bid_System.repository;

import realExamplesBased_LLD.Auction_Bid_System.domain.Auction;

public interface AuctionRepository {
    void save(Auction auction);
    Auction findById(String auctionId);
}
