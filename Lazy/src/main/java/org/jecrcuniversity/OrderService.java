package org.jecrcuniversity;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class OrderService {

    public OrderService()
    {
        System.out.println("Eager OrderService Created");
    }
}
