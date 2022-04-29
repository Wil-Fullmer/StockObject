/*
Wil Fullmer
CSC-160380
Stock Object Homework 9
-----------------------
Requirements:
    - String data field named symbol for the stocks symbol
    - String data field named name for the stocks name
    - A double data field named previousClosingPrice that stores the stocks price for the previous day
    - A double data field named currentPrice that stores the stock price for the current time
    - A constructor that creates a stock with the specified symbol and name
    - A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice

Test Program:
Symbol: ORCL
Name: Oracle Corporation
Previous Closing Price: 34.5
Current Price: 34.35
 */

public class Stock {

    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentClosingPrice;


    public Stock(String symbol, String name, double previousClosingPrice, double currentClosingPrice) {
        String validSymbol = symbol.toLowerCase();
        String validName = name.toLowerCase();
        this.previousClosingPrice = previousClosingPrice;
        this.currentClosingPrice = currentClosingPrice;
        this.symbol = symbol;
        this.name = name;

    }



    public double getChangePercent() {

        double decimalPercentChanged = this.currentClosingPrice / this.previousClosingPrice;
        double percentChanged = decimalPercentChanged;

        if(this.previousClosingPrice > this.currentClosingPrice) {
            percentChanged = (decimalPercentChanged - 1) * 100;
        }
        else {
            percentChanged = (1 - decimalPercentChanged) * 100;
        }


        return decimalPercentChanged;
    }



}