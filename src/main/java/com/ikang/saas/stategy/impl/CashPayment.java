package com.ikang.saas.stategy.impl;

import com.ikang.saas.annotation.StrategyType;
import com.ikang.saas.stategy.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author xuyang
 */
@Slf4j
@StrategyType(value = 103)
@Service
public class CashPayment implements Payment {

    @Override
    public void pay() {
        log.info("cash pay !");
    }
}
