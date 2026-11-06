package com.jecrc.service;

import com.jecrc.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderTotalManager implements OrderTotalService {

    private BillCalculator billCalculator;

    public OrderTotalManager(BillCalculator billCalculator) {
        this.billCalculator = billCalculator;
    }

    @Override
    public double getOrderTotal(Order order) {

        return billCalculator.calculate(order);
    }
}