package entities;

public class EuaInterestService implements InterestService {
    private double interestRate;

    public EuaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
