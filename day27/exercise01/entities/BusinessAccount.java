package entities;

public final class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount(int number, String name, double balance, double loanLimit) {
        super(number, name, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public final void withdraw(double value) {
        super.withdraw(value);
        this.balance -= 2;
    }

    public void loan(Double amount) {
        if (amount >= loanLimit) System.out.println("insufficient funds.");
        else balance += amount - 10;
    }


    public Double getloanLimit() {
        return this.loanLimit;
    }
}

