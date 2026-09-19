public class Opgave3 {

    double applyDiscount(double price, double discountPercent) {
        return price - (price * discountPercent / 100);
    }

    double addTax(double price) {
        return price * 1.25;
    }

    double calculateFinalPrice(double basePrice, double discount) {
        double discountedPrice = applyDiscount(basePrice, discount);
        double finalPrice = addTax(discountedPrice);
        return finalPrice;

    }

    void main() {
        double basePrice = 500;
        double discountPercent = 20;
        System.out.println(calculateFinalPrice(basePrice, discountPercent));
    }
}
