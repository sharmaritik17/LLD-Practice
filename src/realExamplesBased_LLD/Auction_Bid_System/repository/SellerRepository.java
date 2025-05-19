package realExamplesBased_LLD.Auction_Bid_System.repository;

import realExamplesBased_LLD.Auction_Bid_System.domain.Seller;

public interface SellerRepository {
    void save(Seller seller);
    Seller findById(String id);
}
