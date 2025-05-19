package realExamplesBased_LLD.Auction_Bid_System.repository.impl;

import realExamplesBased_LLD.Auction_Bid_System.domain.Seller;
import realExamplesBased_LLD.Auction_Bid_System.repository.SellerRepository;

import java.util.HashMap;
import java.util.Map;

public class SellerRepositoryImpl implements SellerRepository {
    private final Map<String, Seller> sellerStore = new HashMap<>();

    @Override
    public void save(Seller seller) {
        sellerStore.put(seller.getUserId(), seller);
    }

    @Override
    public Seller findById(String id) {
        return sellerStore.get(id);
    }
}
