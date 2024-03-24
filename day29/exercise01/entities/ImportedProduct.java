package entities;

public final class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name + " R$ " + totalPrice() + " (Customs fee: R$ " + 
            String.format("%.2f", customsFee)  + ")";
    }

    public Double totalPrice() {
        return this.price + this.customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }
}
