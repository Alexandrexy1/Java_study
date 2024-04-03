package entities;

public class BusinessAccount extends Account {
    private Double loan;

    public BusinessAccount(int number, String holder, double balance, double loan) {
        super(number, holder, balance);
        this.loan = loan;
    }

    @Override
    public void withdraw(double value) {
        super.withdraw(value);
        this.balance -= 4.50;
    }

    public Double getLoan() {
        return this.loan;
    }
}
