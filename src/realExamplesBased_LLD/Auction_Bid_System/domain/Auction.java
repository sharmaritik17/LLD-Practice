package realExamplesBased_LLD.Auction_Bid_System.domain;

import realExamplesBased_LLD.Auction_Bid_System.exception.BidFailedException;

import java.util.*;

public class Auction{
    private String auctionId;
    private double minBid;
    private double maxBid;
    private Seller seller;
    private boolean isClosed;
    private List<Bid> bids;
    private boolean highestUniqueBid; // true: highest unique bid, false: lowest unique bid

    public Auction(String auctionId, double minBid, double maxBid, Seller seller) {
        this.auctionId = auctionId;
        this.minBid = minBid;
        this.maxBid = maxBid;
        this.seller = seller;
        this.isClosed = false;
        this.bids = new ArrayList<>();
        this.highestUniqueBid = true; // default behavior
    }

    public String getAuctionId() {
        return auctionId;
    }
    public boolean setIsClosed(boolean isClosed) {return this.isClosed = isClosed;}

    public void placeBid(Buyer buyer, double amount) {
        Bid bid = new Bid(buyer, amount);
        bids.add(bid);
    }

    public List<Bid> getBids() {
        return bids;
    }
}
