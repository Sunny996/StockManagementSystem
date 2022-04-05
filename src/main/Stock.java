package main;

public class Stock {
    public String stockName;
    public int noOfShares;
    public int sharePrice;

    public Stock(String stockName, int noOfShares, int sharePrice) {
        this.stockName = stockName;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
    }
    public int stockValue(){
        return this.sharePrice*this.noOfShares;
    }

    @Override
    public String toString(){
        return "Stock Name : "+stockName+"\n"+
                "Number of shares : "+noOfShares+"\n"+
                "Share Price : "+sharePrice;
    }
}
