package model.entities;

import model.exception.WithdrawValueException;

public final class BusinessAccount extends Account {
    private Double loan;

    public BusinessAccount(String name, String number, double balance, double loan) {
        super(name, number, balance);
        this.loan = loan;
    }

    @Override
    public final void withdraw(double value) throws WithdrawValueException {
        super.withdraw(value + 5.0);
    }

    public Double getLoan() {
        return loan;
    }
}
