package dev.maxpetrushin.web.rest.consuming_rest;

public class PaymentProxy {
    private String description;
    private double amount;

    public PaymentProxy(String description, double amount) {
        this.description = description;
    }

    public PaymentProxy() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
