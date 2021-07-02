package Service;

import Model.StockModel;

import java.util.ArrayList;

public interface ServieceInterface {
    public abstract void addStock(ArrayList<StockModel> stockList);
    public abstract void editStock(ArrayList<StockModel> stockList, String name);
    public abstract void deleteStock(ArrayList<StockModel> stockList, String name);
    public abstract void view(ArrayList<StockModel> stockList);
}
