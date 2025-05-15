package Strategy.Strategy_Pattern_Payment;

import Strategy.Strategy_Pattern_Payment.AllPaymentMethodsImpl.UPIPayment;

public class Client extends SelectPayMethod{
    public static void main(String[] args) {
        SelectPayMethod selectPayMethod = new SelectPayMethod();
        selectPayMethod.setSetPaymentMathod(new UPIPayment());
        selectPayMethod.payAmount(500);
    }
}
