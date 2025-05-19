package realExamplesBased_LLD.Auction_Bid_System.repository.impl;

import realExamplesBased_LLD.Auction_Bid_System.domain.Auction;
import realExamplesBased_LLD.Auction_Bid_System.repository.AuctionRepository;

import java.util.HashMap;
import java.util.Map;

public class AuctionRepositoryImpl implements AuctionRepository {
    private final Map<String, Auction> auctionStore = new HashMap<>();

    @Override
    public void save(Auction auction) {
        auctionStore.put(auction.getAuctionId(), auction);
    }

    @Override
    public Auction findById(String auctionId) {
        return auctionStore.get(auctionId);
    }
}
