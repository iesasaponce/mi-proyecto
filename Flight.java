class Flight {
    private String destination;
    private double basePrice;

    public Flight(String destination, double basePrice) {
        this.destination = destination;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}