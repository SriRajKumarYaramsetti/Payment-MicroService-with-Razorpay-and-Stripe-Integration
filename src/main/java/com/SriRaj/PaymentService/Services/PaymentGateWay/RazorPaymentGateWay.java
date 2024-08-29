package com.SriRaj.PaymentService.Services.PaymentGateWay;


import org.springframework.stereotype.Service;

@Service
public class RazorPaymentGateWay  implements PaymentGateWay{


    @Override
    public String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount) {
        return null;
    }
}
