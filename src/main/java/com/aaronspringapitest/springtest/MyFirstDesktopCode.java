package com.aaronspringapitest.springtest;

/**
 * This class will calculate the total price of today's exp
 */
public class MyFirstDesktopCode {
    private Integer priceOfMonitor;
    private Integer priceOfKeyBoard;
    private Integer priceOfHDMI;
    private Integer sumOfAll;

    public Integer getSumOfAll() {
        return priceOfHDMI+priceOfKeyBoard
                +priceOfMonitor;
    }

    public void setSumOfAll(Integer sumOfAll) {
        this.sumOfAll = sumOfAll;
    }
// Getters and setters


    public MyFirstDesktopCode(Integer priceOfMonitor, Integer priceOfKeyBoard, Integer priceOfHDMI) {
        this.priceOfMonitor = priceOfMonitor;
        this.priceOfKeyBoard = priceOfKeyBoard;
        this.priceOfHDMI = priceOfHDMI;
    }

    public Integer getPriceOfMonitor() {
        return priceOfMonitor;
    }

    public void setPriceOfMonitor(Integer priceOfMonitor) {
        this.priceOfMonitor = priceOfMonitor;
    }

    public Integer getPriceOfKeyBoard() {
        return priceOfKeyBoard;
    }

    public void setPriceOfKeyBoard(Integer priceOfKeyBoard) {
        this.priceOfKeyBoard = priceOfKeyBoard;
    }

    public Integer getPriceOfHDMI() {
        return priceOfHDMI;
    }

    public void setPriceOfHDMI(Integer priceOfHDMI) {
        this.priceOfHDMI = priceOfHDMI;
    }

    @Override
    public String toString() {
        return
                "priceOfMonitor=  " + priceOfMonitor +
                ",\npriceOfKeyBoard= " + priceOfKeyBoard +
                ", \npriceOfHDMI= " + priceOfHDMI
                + ",\ntotal price= " + getSumOfAll() ;
    }
    public static void main(String args[]){
        MyFirstDesktopCode myFirstDesktopCode = new MyFirstDesktopCode(40,28,30);
        System.out.println(myFirstDesktopCode);
    }
}
