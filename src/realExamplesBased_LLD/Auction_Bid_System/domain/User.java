package realExamplesBased_LLD.Auction_Bid_System.domain;

public abstract class User {
    protected String name;
    protected String userId;
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
