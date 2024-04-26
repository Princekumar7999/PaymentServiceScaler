package controllers;


import dtos.InitiatePaymentRequestDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import services.PaymentService;
import services.RazorpayException;

@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException {
        //return "Order Id "  + requestDto.getOrderId();
        return paymentService.initiatePayment(
                requestDto.getOrderId(),
                requestDto.getEmail()
        );
    }
}
