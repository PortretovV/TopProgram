package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Это лучшая программа века, хвала богам");
        Spring spring = new Spring("6.1.0.7","Hibernate", "JSP" ,"Яндекс");
        System.out.println(spring.toString());
    }
}
