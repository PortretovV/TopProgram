package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Это лучшая программа");
        Spring spring = new Spring("6.1.0.7","Hibernate", "Thymeleaf" );
        System.out.println(spring.toString());
    }
}
