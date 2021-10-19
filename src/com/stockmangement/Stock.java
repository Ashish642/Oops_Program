package com.stockmangement;

public class Stock {
    public String stockName;
    private String noOfShare;
    public int sharePrice;
    private int totalSharePrice;
    private int totalStock;


    Stock(String stockName, int noOfShare, int sharePrice)
    {
        this.stockName= stockName;
        this.noOfShare= noOfShare;
        this.sharePrice = sharePrice;
    }
    public String getStockName()
    {
        return stockName;

    }
    public int getNoOShare()
    {
        return noOfShare;
    }
    public int getSharePrice()
    {
        return sharePrice;
    }
    public int grtTotalSharePrice()
    {
        return totalSharePrice;
    }
    public int getTotalSharePrice()
    {
        return totalStock;

    }
    public void setStockName(String stockName)
    {
        this.stockName = stockName;
    }
    public void setNoOfShare(int noOfShare)
    {
        this.noOfShare=noOfShare;

    }
    public void setSharePrice(int sharePrice){
        this.sharePrice = sharePrice;
    }
    public void setTotalSharePrice(int totalSharePrice)
    {
        this.totalSharePrice= totalSharePrice;
    }
    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }
}
