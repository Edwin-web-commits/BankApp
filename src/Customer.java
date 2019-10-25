import java.util.ArrayList;

public class Customer {
    private String name;
   // private double Transaction;
    public  ArrayList<Double>transactions;


    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions=new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double initialAmount)
    {
        transactions.add(initialAmount);
    }
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }




}
