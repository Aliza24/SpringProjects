package com.jecrc.service;

import com.jecrc.model.Order;

public interface BillCalculator {

    double calculate(Order order);
}