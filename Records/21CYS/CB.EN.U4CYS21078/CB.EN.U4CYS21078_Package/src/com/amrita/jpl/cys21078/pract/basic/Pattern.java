package com.amrita.jpl.cys21078.pract.basic;

/**
 * The Pattern class generates a specific pattern using asterisks and equal signs.
 * The pattern consists of alternating lines of asterisks and equal signs.
 * The pattern is printed to the console.
 * @author suvetha
 */
public class Pattern {
    public static void main(String[] args){
        for (int i = 0; i < 9; i++) {
            if(i%2 == 0){
                System.out.println("* * * * * * ==================================");
            }
            else {
                System.out.println("* * * * *  ===================================");
            }
        }
        for(int i = 0;i < 6; i++){
            System.out.println("==============================================");
        }
    }
}


