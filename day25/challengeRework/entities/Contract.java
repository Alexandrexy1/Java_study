package entities;

import java.time.LocalDate;

public class Contract {
    private LocalDate data;
    private Double value;
    private Integer duration;


    public Contract(LocalDate data, double value, int duration) {
        this.data = data;
        this.value = value;
        this.duration = duration;
    }

    public LocalDate getData() {
        return this.data;
    }

    public double getValue() {
        return this.value;
    }

    public int getDuration() {
        return this.duration;
    }

    public double subTotal() {
        return this.value * this.duration;
    }

    public String monthAndYear() {
        return this.data.getMonthValue() < 10 ? "0" + this.data.getMonthValue() + "/" + this.data.getYear() :
            this.data.getMonthValue() + "/" + this.data.getYear();
    }

    public String toString() {
        return this.data + " " + this.value;
    }
}
