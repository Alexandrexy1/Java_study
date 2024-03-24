package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name + " (used) R$ " + String.format("%.2f", price) + 
            "Manufacture date (" + dtf.format(manufactureDate) + ")";
    }

    public LocalDate getManufactureDate() {
        return this.manufactureDate;
    }

}
