package main;
import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StockPortfolio stockPortfolio=new StockPortfolio();
        stockPortfolio.stockReport();
    }

    public int noOfStocks=3;
    Stock[] stocksArray= {new Stock("Tata Motors", 100, 450),
            new Stock("Tata Power",150, 230),
            new Stock("HDFC",50,2000)};

    public int totalStockValue(){
        int totalStockValue=0;
        for(Stock stock:stocksArray)
            totalStockValue+=stock.stockValue();
        return totalStockValue;
    }
    public void stockReport(){
        for(Stock stock:stocksArray){
            System.out.println(stock);
            System.out.println("Stock Value "+stock.stockValue());
            System.out.println("----------------------");
        }
        System.out.println("Total Stock Value "+totalStockValue());
    }

}
