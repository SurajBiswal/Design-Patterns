package Strategy_Pattern_Payment;

public class SelectPayMethod {
    PaymentMethod paymentMethod;
    public void setSetPaymentMathod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void payAmount(double amount){
        if(paymentMethod==null){
            throw new IllegalStateException("PaymentMethod is not set");
        }
        paymentMethod.pay(amount);
    }

}
