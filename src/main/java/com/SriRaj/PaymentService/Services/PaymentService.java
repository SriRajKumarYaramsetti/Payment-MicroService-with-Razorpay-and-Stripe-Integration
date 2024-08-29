package com.SriRaj.PaymentService.Services;

import com.SriRaj.PaymentService.Services.PaymentGateWay.PaymentGateWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    private PaymentGateWayChooserStrategy paymentGateWayChooserStrategy;

    @Autowired
    public PaymentService(PaymentGateWayChooserStrategy paymentGateWayChooserStrategy){
        this.paymentGateWayChooserStrategy=paymentGateWayChooserStrategy;
    }

    public String initiatePayment(String orderId,String email,String phoneNumber,Long amount){
        // Order order = orderService.getOrderDetails(orderId)
        // Long amount = order.getAmount();
        // double amount = 10.10; // store number * 100
        // String orderId, String email, String phoneNumber, Long amount
        //  Long amount = 1010L; // 10.00 => 1000
        PaymentGateWay paymentGateWay=paymentGateWayChooserStrategy.getBestPaymentGateway();
        return paymentGateWay.generatePaymentLink(orderId, email, phoneNumber, amount);

    }

}
