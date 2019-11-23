package com.ikang.saas;

import com.ikang.saas.stategy.Payment;
import com.ikang.saas.stategy.PaymentHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DesignApplicationTests {

    @Autowired
    private PaymentHandler paymentHandler;

    @Test
    public void getPaymentStrategy() {
        Payment payment = paymentHandler.getPaymentStrategy(101);
        payment.pay();
    }
}
