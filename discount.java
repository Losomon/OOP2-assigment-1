/*solomon mwangi ct101/g/20741/23*/
class Main{
    public static double get_discount(double amountSpend) {
        double discount;
        if (amountSpend > 5000) {
            discount = (10 * amountSpend) / 100; // 10% discount for amounts over 5000
        } else if (amountSpend > 1000) { // Between 1001 and 5000 (inclusive)
            discount = (5 * amountSpend) / 100; // 5% discount
        } else {
            discount = 0; // No discount for 1000 or less
        }
        return discount;
    }

    public static void main(String[] args) {
        double amountSpend = 11000;
        double discount = get_discount(amountSpend);
        System.out.println("The discount is: " + discount);
    }
}