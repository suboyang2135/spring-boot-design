package com.ikang.saas.stategy;

import com.ikang.saas.annotation.StrategyType;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xuyang
 */
@Component
public class PaymentProcess implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Object> paymentStrategyBeanMap = applicationContext.getBeansWithAnnotation(StrategyType.class);
        paymentStrategyBeanMap.forEach((key,val)->{
            Class<Payment> paymentClass = (Class<Payment>) val.getClass();
            int code = paymentClass.getAnnotation(StrategyType.class).value();
            PaymentHandler.paymentStrategyBeanMap.put(code, paymentClass);
        });
    }
}
