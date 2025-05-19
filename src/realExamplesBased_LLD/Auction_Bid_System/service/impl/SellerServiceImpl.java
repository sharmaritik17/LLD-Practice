package realExamplesBased_LLD.Auction_Bid_System.service.impl;

import realExamplesBased_LLD.Auction_Bid_System.domain.Seller;
import realExamplesBased_LLD.Auction_Bid_System.repository.SellerRepository;
import realExamplesBased_LLD.Auction_Bid_System.service.SellerService;

public class SellerServiceImpl implements SellerService {
    private final SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public void addSeller(Seller seller) {
        sellerRepository.save(seller);
    }

    @Override
    public Seller getSellerDetails(String sellerId) {
        return sellerRepository.findById(sellerId);
    }
}
