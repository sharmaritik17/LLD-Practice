package behavioralPattern.statePattern.enums;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int value;
    Coin(int coin) {
        this.value = coin;
    }
}
