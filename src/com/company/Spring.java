package com.company;


public class Spring {
    private String number;
    private String fioUser;

    public Spring(String number, String fioUser) {
        this.number = number;
        this.fioUser = fioUser;
    }

    @Override
    public String toString() {
        return "Вы используете Спринг{" +
                "Текущая версия =" + number +
                ", ваше имя ='" + fioUser + '\'' +
                '}';
    }
}
