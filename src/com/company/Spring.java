package com.company;


public class Spring {
    private String number;
    private String dataBaseAccess;
    private String technologyView;
    private String organization;

    public Spring(String number, String dataBaseAccess, String technologyView, String organization) {
        this.number = number;
        this.technologyView = technologyView;
        this.dataBaseAccess = dataBaseAccess;
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Вы используете Спринг, " +
                "Текущая версия = " + number +
                ", технология представления = "+ technologyView +
                ", доступ к данным осуществляется посредством = " + dataBaseAccess +
                ", и вы работаете в организации = " + organization +"\n";
    }
}
