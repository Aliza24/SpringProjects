package com.jecrc.service;

import com.jecrc.model.Cart;
import com.jecrc.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderTotalCalculator implements BillCalculator {

    @Override
    public double calculate(Order order) {

        double total = 0;

        for (Cart item : order.getItems()) {
            total += item.getSubtotal();
        }

        return total;
    }
}