package com.ikang.saas.stategy.impl;

import com.ikang.saas.annotation.StrategyType;
import com.ikang.saas.stategy.Payment;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyang
 */
@Slf4j
@StrategyType(value = 103)
public class CashPayment implements Payment {

    @Override
    public void pay() {
        log.info("cash pay !");
    }
}
