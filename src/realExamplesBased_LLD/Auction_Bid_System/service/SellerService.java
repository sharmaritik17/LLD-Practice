package realExamplesBased_LLD.Auction_Bid_System.service;

import realExamplesBased_LLD.Auction_Bid_System.domain.Seller;

public interface SellerService {
    void addSeller(Seller seller);
    Seller getSellerDetails(String sellerId);
}
