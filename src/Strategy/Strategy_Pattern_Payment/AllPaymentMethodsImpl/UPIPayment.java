package Strategy.Strategy_Pattern_Payment.AllPaymentMethodsImpl;

import Strategy.Strategy_Pattern_Payment.PaymentMethod;

public class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("paying "+ amount+" via UPI");
    }
}
