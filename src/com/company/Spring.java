package com.company;


public class Spring {
    private String number;
    private String dataBaseAccess;
    private String technologyView;

    public Spring(String number, String dataBaseAccess, String technologyView) {
        this.number = number;
        this.technologyView = technologyView;
        this.dataBaseAccess = dataBaseAccess;
    }

    @Override
    public String toString() {
        return "Вы используете Спринг, " +
                "Текущая версия = " + number +
                ", технология представления = "+ technologyView +
                ", доступ к данным осуществляется посредством = " + dataBaseAccess +"\n";
    }
}
