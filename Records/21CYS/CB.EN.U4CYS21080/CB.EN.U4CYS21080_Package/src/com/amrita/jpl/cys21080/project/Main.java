package com.amrita.jpl.cys21080.project;

public class Main {

    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        loginPage loginPage = new loginPage(idandPasswords.getLoginInfo());

    }
}