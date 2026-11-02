package org.jecrcuniversity.sample;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class A {
//    private B b;
    // Initialization of Circular Dependecy
//    public A(B b)
//    {
//        this.b = b;
//    }

    //    public A()
//    {
//        System.out.println("A Created");
//        this.b = new B();
//    }
    // Implementation of Lazy
//    public A(@Lazy B b)
//    {
//        this.b = b;
//        System.out.println("Lazy A Created");
//    }
//    public void showA()
//    {
//        System.out.println("Inside A");
//        b.showB();
//    }
// Eager Initialization
    public A() {
//    this.b = b;
        System.out.println("Eager A Created");
    }

    public void showA() {
        System.out.println("Inside A");
//        b.showB();
    }
}
