package service;

import model.PaymentInfo;

public class PaymentService {
public PaymentInfo getPaymentById(Long id){
    PaymentInfo paymentInfo=new PaymentInfo();
    paymentInfo.setId(1L);
    paymentInfo.setAmount(1000.);
    paymentInfo.setCurrency("USD");
    paymentInfo.setStatus("Succes");
    return paymentInfo;
}
}
