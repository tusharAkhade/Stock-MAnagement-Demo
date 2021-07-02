package Model;

public class StockModel {
    String name;
    double price;
    int numOfStocks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfStocks() {
        return numOfStocks;
    }

    public void setNumOfStocks(int numOfStocks) {
        this.numOfStocks = numOfStocks;
    }

    @Override
    public String toString() {
        return "StockModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numOfStocks=" + numOfStocks +
                '}';
    }
}

