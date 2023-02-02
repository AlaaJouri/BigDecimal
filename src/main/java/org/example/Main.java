package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(0.4).add(new BigDecimal(5.5).multiply(new BigDecimal(7.4))));
    }

}