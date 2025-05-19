package realExamplesBased_LLD.Auction_Bid_System.service;

import realExamplesBased_LLD.Auction_Bid_System.domain.Buyer;

public interface BuyerService {
    void addBuyer(Buyer buyer);
    Buyer getBuyerDetails(String buyerId);
    void updateBuyerBudget(String buyerId, int amount);
}
