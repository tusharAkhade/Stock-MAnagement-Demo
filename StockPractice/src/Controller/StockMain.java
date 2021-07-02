package Controller;

import Model.StockModel;
import Service.Service;
import Service.ServieceInterface;

import java.util.ArrayList;
import java.util.Scanner;


// we have to add stock in stock list
// arrrayList to store all the stocks


public class StockMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // created a stockList
        ArrayList<StockModel> stockList = new ArrayList();
        ServieceInterface servieceInterface = new Service();        // creating a Service object

        int option = 0;
        while (option != 5) {
            System.out.println("Enter 1 for add\nEnter 2 to delete\nEnter 3 to edit\nEnter 4 to view\nEnter 5 to exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    servieceInterface.addStock(stockList);
                    break;
                case 2:
                    System.out.println("Enter a stock name :");
                    String name1 = scanner.next();

                    servieceInterface.deleteStock(stockList, name1);
                    break;
                case 3:
                    System.out.println("Enter a stock name: ");
                    String name2 = scanner.next();

                    servieceInterface.editStock(stockList, name2);
                    break;
                case 4:
                    System.out.println(stockList);
                    break;
                case 5:
                    break;
                default:
            }
        }
    }
}
