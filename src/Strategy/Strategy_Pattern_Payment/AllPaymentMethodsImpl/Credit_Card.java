package Strategy.Strategy_Pattern_Payment.AllPaymentMethodsImpl;

import Strategy.Strategy_Pattern_Payment.PaymentMethod;

public class Credit_Card implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("paying "+ amount+" via credit card");
    }
}
