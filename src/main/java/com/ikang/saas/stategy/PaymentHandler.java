package com.ikang.saas.stategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xuyang
 */
@Component
public class PaymentHandler {

    @Autowired
    private ApplicationContext applicationContext;

    public static Map<Integer, Class<Payment>> paymentStrategyBeanMap = new ConcurrentHashMap<>();

    public Payment getPaymentStrategy(Integer paymentType) {
        Class<Payment> paymentClass = paymentStrategyBeanMap.get(paymentType);
        if (null == paymentClass) {
            throw new IllegalArgumentException("未找到对应的付款方式");
        }
        return applicationContext.getBean(paymentClass);
    }
}
