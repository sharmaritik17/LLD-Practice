package realExamplesBased_LLD.Auction_Bid_System.service.impl;

import realExamplesBased_LLD.Auction_Bid_System.domain.Auction;
import realExamplesBased_LLD.Auction_Bid_System.domain.Bid;
import realExamplesBased_LLD.Auction_Bid_System.domain.Buyer;
import realExamplesBased_LLD.Auction_Bid_System.helper.AuctionHelper;
import realExamplesBased_LLD.Auction_Bid_System.repository.AuctionRepository;
import realExamplesBased_LLD.Auction_Bid_System.service.AuctionService;
import realExamplesBased_LLD.Auction_Bid_System.service.BuyerService;

public class AuctionServiceImpl implements AuctionService {
    private final AuctionRepository auctionRepository;
    private final BuyerService buyerService;

    public AuctionServiceImpl(AuctionRepository auctionRepository, BuyerService buyerService) {
        this.auctionRepository = auctionRepository;
        this.buyerService = buyerService;
    }


    @Override
    public void createAuction(Auction auction) {
        auctionRepository.save(auction);
    }

    @Override
    public String closeAuction(String auctionId) {
        Auction toBeRemoved = auctionRepository.findById(auctionId);
        Bid winnerBid = AuctionHelper.determineWinner(toBeRemoved);
        return winnerBid != null ? winnerBid.getBuyer().getName() : null;
    }

    @Override
    public void placeBid(String auctionId, Buyer buyer, double amount) {
        Auction auction = auctionRepository.findById(auctionId);
        if (buyer.getBudget() >= amount) {
            auction.placeBid(buyer, amount);
            auctionRepository.save(auction);
        } else {
            throw new IllegalArgumentException("Bid exceeds buyer's budget");
        }
    }

    @Override
    public void withdrawBid(String auctionId, String buyerId) {
        Auction auction = auctionRepository.findById(auctionId);
        //todo helper class
        auction.getBids().removeIf(bid -> bid.getBuyer().getUserId().equals(buyerId));

        auctionRepository.save(auction);
    }

    @Override
    public Auction getAuctionDetails(String auctionId) {
        return auctionRepository.findById(auctionId);
    }
}
