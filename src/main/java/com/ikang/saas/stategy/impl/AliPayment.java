package com.ikang.saas.stategy.impl;

import com.ikang.saas.annotation.StrategyType;
import com.ikang.saas.stategy.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author xuyang
 */
@Slf4j
@StrategyType(value = 101)
@Service
public class AliPayment implements Payment {

    @Override
    public void pay() {
        log.info("alipay");
    }
}
