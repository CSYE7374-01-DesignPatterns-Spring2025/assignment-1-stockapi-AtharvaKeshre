package edu.neu.csye7374;

class TechStock extends Stock {
    public TechStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    protected double calculateNewPrice(double bid) {
        return price * 1.02 + bid * 0.01;
    }

    @Override
    public String getMetric() {
        return String.format("%.2f",(price * 1.5 - bids.size()));
    }
}