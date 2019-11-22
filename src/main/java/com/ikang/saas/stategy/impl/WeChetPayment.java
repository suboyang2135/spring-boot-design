package com.ikang.saas.stategy.impl;

import com.ikang.saas.annotation.StrategyType;
import com.ikang.saas.stategy.Payment;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xuyang
 */
@Slf4j
@StrategyType(value = 102)
public class WeChetPayment implements Payment {

    @Override
    public void pay() {
        log.info("wechet pay !");
    }
}
