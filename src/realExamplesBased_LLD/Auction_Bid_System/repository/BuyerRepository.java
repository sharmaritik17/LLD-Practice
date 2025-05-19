package realExamplesBased_LLD.Auction_Bid_System.repository;

import realExamplesBased_LLD.Auction_Bid_System.domain.Buyer;

public interface BuyerRepository {
    void save(Buyer buyer);
    Buyer findById(String id);
}
