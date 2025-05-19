package realExamplesBased_LLD.Auction_Bid_System.repository.impl;

import realExamplesBased_LLD.Auction_Bid_System.domain.Buyer;
import realExamplesBased_LLD.Auction_Bid_System.repository.BuyerRepository;

import java.util.HashMap;
import java.util.Map;

public class BuyerRepositoryImpl implements BuyerRepository {
    private final Map<String, Buyer> buyerStore = new HashMap<>();

    @Override
    public void save(Buyer buyer) {
        buyerStore.put(buyer.getUserId(), buyer);
    }

    @Override
    public Buyer findById(String id) {
        return buyerStore.get(id);
    }
}
