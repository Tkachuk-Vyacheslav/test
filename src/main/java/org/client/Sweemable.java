package org.client;

import org.client.dto.runable;

public interface Sweemable extends runable, seetablr {
    
    public void swim();
    public static  final int q = 12;

    default void foo() {
        System.out.println("A");
    }
    
}
