package com.SriRaj.PaymentService.Controllers;


import com.SriRaj.PaymentService.Dtos.InitiatePaymentRequestDto;
import com.SriRaj.PaymentService.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;


    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    @GetMapping("/hello")
    public String GetDetails(){
       return "Hello from the payment Controller";

    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto request){
        return paymentService.initiatePayment(request.getOrderId(), request.getEmail(), request.getPhoneNumber(), request.getAmount());
    }
}
