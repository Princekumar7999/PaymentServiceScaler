package services;


import org.springframework.stereotype.Service;
import paymentgateways.PaymentGateway;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(Long orderId, String email) throws RazorpayException {
        return paymentGateway.generatePaymentLink(orderId, email);
    }
}