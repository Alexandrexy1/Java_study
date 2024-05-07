package models.services;

import java.time.LocalDate;

import models.entities.Contract;
import models.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;
    
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double baseQuota = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(baseQuota, i);
            System.out.println(interest);
            double fee = onlinePaymentService.paymentFee(baseQuota + interest);
            System.out.println(fee);
            double quota = baseQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }
}
