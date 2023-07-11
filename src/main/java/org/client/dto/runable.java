package org.client.dto;

public interface runable {
    void run();

    default void runQweekly() {
        System.out.println("run very quikly");
    }

    default void foo() {
        System.out.println("b");
    }

}
