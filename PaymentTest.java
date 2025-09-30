interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Credit Card");
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to UPI");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        PaymentGateway pay1 = new CreditCardPayment();
        pay1.pay(1500);
        pay1.refund(500);

        PaymentGateway pay2 = new UPIPayment();
        pay2.pay(1200);
        pay2.refund(400);
    }
}
