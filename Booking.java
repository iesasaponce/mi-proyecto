import java.util.List;

class Booking {
    private List<Flight> flights;
    private Passenger passenger;

    public Booking(List<Flight> flights, Passenger passenger) {
        this.flights = flights;
        this.passenger = passenger;
    }

    public void processBooking() {
        double total = calculateTotal();
        System.out.println("Total a pagar: $" + total);
        System.out.println("Reserva confirmada.");
    }

    public double calculateTotal() {
        double basePrice = calculateBasePrice();
        return applyDiscountsToBasePrice(basePrice);
    }

    private double calculateBasePrice() {
        double total = 0;
        for (Flight flight : flights) {
            total += flight.getBasePrice();
        }
        return total;
    }

    private double applyDiscountsToBasePrice(double basePrice) {
        double total = basePrice;

        if (passenger.isFrequentFlyer) {
            total *= 0.85; // 15% descuento
        }

        if (passenger.hasDiscountCode) {
            total *= 0.90; // 10% adicional
        }

        return total;
    }
}
