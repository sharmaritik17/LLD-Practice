package realExamplesBased_LLD.Auction_Bid_System.domain;

public class Buyer extends User{
    private int auctionParticipations;
    private int budget;

    public Buyer(String name, String userId) {
        super(name, userId);
        this.auctionParticipations = 0;
    }

    public void incrementAuctionPraticipation() {
        auctionParticipations++;
    }
    public int getBudget() {return budget;}

    public void setBudget(int amount) {
        budget = amount;
    }
}
