package Service;

import Model.StockModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Service implements ServieceInterface {

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addStock(ArrayList<StockModel> stockList) {
        StockModel stock = new StockModel();       // creating a object for StockModel
        // Taking inputs for stock
        System.out.println("Enter a stock name: ");
        String name = scanner.next();

        System.out.println("Enter price of stock : ");
        double price = scanner.nextDouble();

        System.out.println("Enter number of stock: ");
        int numStock = scanner.nextInt();

        // created a single stock abd setting its value
        stock.setName(name);
        stock.setNumOfStocks(numStock);
        stock.setPrice(price);

        // adding stock in stockList
        stockList.add(stock);
    }

    @Override
    public void editStock(ArrayList<StockModel> stockList, String name) {
        for (int i = 0; i < stockList.size(); i++) {            // loop through the stockList
            if (stockList.get(i).getName().equals(name)){      // checking the stock from stockList
                System.out.println("Enter a new stock price :");
                double newPrice = scanner.nextDouble();

                System.out.println("Enter a number of stock :");
                int newNumStock = scanner.nextInt();

                stockList.get(i).setPrice(newPrice);
                stockList.get(i).setNumOfStocks(newNumStock);
            }
        }
    }

    @Override
    public void deleteStock(ArrayList<StockModel> stockList, String name) {
        for (int i = 0; i < stockList.size(); i++) {            // loop through the stockList
            if (stockList.get(i).getName().equals(name)){      // checking the stock from stockList
                stockList.remove(i);                            // if stock is present then remove it from StockList
            }
        }
    }

    @Override
    public void view(ArrayList<StockModel> stockList) {

    }
}
