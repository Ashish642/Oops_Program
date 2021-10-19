package com.stockmangement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class StockPortfolio {
    ArrayList<Stock> stock = new ArrayList<Stock>();
    public static Scanner sc = new Scanner(System.in);
    public static int totalSharePrice,noOfShare =0 ,sharePrice =0,item=0, totalStock=0;
    public static String shareName = null;

    public static void main(String[] args) {
        StockPortfolio stocks= new StockPortfolio();
        System.out.println("\n\n Stock Management ");
        System.out.println("\n How many no. of stock to be added: ");
        int stock = sc.nextInt();
        for (int i=0; i<stock;i++) {
            stocks.added(shareName,noOfShare,sharePrice);
            stocks.calculatestock();

        }
        stocks.display();

    }
    public void  addStock(String shareName,int noOfShare,int sharePrice) {
        System.out.println("\n Enter the stock name:");
        shareName = sc.next();
        System.out.println("\n Entr the no. of share: ");
        noOfShare = sc.nextInt();
        System.out.println("\n Enter the shareprice: ");
        sharePrice= sc.nextInt();
        Stock details = new Stock(shareName,noOfShare,sharePrice);
        stock.add(details);
        totalSharePrice = noOfShare*sharePrice;
        totalStock = totalStock *noOfShare;

    }
    public static int calculatestock(Stock details)
    {
        return totalStock;

    }
    public static calculateshareprice(Stock details)
    {
        return sharePrice;

    }
    public void calculatestock(){
        totalSharePrice = StockPortfolio.totalSharePrice(stock.get(item));
        this.stock.get(item).setTotalSharePric(totalshareprice);
        totalStock = StockPortfolio.calculatestock(t)
    }
}
