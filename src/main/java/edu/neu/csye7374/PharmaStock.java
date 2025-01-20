package edu.neu.csye7374;

class PharmaStock extends Stock {
    public PharmaStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    protected double calculateNewPrice(double bid) {
        return price + bid * 0.05;
    }

    @Override
    public String getMetric() {
        return String.format("%.2f",(price / (bids.size() + 1)));
    }
}