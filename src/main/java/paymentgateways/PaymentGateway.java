package paymentgateways;


import services.RazorpayException;

public interface PaymentGateway {
    public String generatePaymentLink(Long orderId, String email) throws RazorpayException;
}