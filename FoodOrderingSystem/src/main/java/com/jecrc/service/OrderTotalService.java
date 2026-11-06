package com.jecrc.service;

import com.jecrc.model.Order;

public interface OrderTotalService {

    double getOrderTotal(Order order);
}