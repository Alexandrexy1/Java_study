package entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }
}
