import payment.*;

public class Main {
    public static void main(String[] args) {

        Customer regularCustomer = new RegularCustomer("Fateme");
        Customer premiumCustomer = new PremiumCustomer("Negin");

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Fateme Sedigh");
        PaymentStrategy payPal = new PayPalPayment("fatemeh@gmail.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        System.out.println("Processing payments for regular customer:");
        regularCustomer.makePayment(creditCard, 100.0);
        regularCustomer.makePayment(payPal, 50.0);

        System.out.println("\nProcessing payments for premium customer:");
        premiumCustomer.makePayment(bitcoin, 200.0);
        premiumCustomer.makePayment(creditCard, 150.0);

        System.out.println("\nRegular Customer Information:");
        regularCustomer.displayCustomerInfo();
        System.out.println("\nPayment History for Regular Customer:");
        regularCustomer.showPaymentHistory();

        System.out.println("\nPremium Customer Information:");
        premiumCustomer.displayCustomerInfo();
        System.out.println("\nPayment History for Premium Customer:");
        premiumCustomer.showPaymentHistory();
    }
}