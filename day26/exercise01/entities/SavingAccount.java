package entities;

public class SavingAccount extends Account {
    private Double interestRate;
    
    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestDouble) {
        super(number, holder, balance);
        this.interestRate = interestDouble;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
