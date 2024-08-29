package com.SriRaj.PaymentService.Services;

import com.SriRaj.PaymentService.Services.PaymentGateWay.PaymentGateWay;
import com.SriRaj.PaymentService.Services.PaymentGateWay.RazorPaymentGateWay;
import com.SriRaj.PaymentService.Services.PaymentGateWay.StripePaymentGateway;
import org.springframework.stereotype.Service;


@Service
public class PaymentGateWayChooserStrategy {
    private RazorPaymentGateWay razorPaymentGateWay;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateWayChooserStrategy( RazorPaymentGateWay razorPaymentGateWay,
                                          StripePaymentGateway stripePaymentGateway)
    {
        this.razorPaymentGateWay=razorPaymentGateWay;
        this.stripePaymentGateway=stripePaymentGateway;

    }


    public PaymentGateWay getBestPaymentGateway() {
//        int randomInt = new Random().nextInt();
//
//        if (randomInt % 2 == 0) {
//            return razorpayPaymentGateway;
//        }
//
        return stripePaymentGateway;
//        return razorpayPaymentGateway;
    }
}
