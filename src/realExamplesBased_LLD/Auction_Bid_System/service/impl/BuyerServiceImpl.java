package realExamplesBased_LLD.Auction_Bid_System.service.impl;

import realExamplesBased_LLD.Auction_Bid_System.domain.Buyer;
import realExamplesBased_LLD.Auction_Bid_System.repository.BuyerRepository;
import realExamplesBased_LLD.Auction_Bid_System.service.BuyerService;

public class BuyerServiceImpl implements BuyerService {
    private final BuyerRepository buyerRepository;

    public BuyerServiceImpl(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    @Override
    public Buyer getBuyerDetails(String buyerId) {
        return buyerRepository.findById(buyerId);
    }

    @Override
    public void updateBuyerBudget(String buyerId, int amount) {
        Buyer buyer = buyerRepository.findById(buyerId);
        buyer.setBudget(amount);
    }
}
