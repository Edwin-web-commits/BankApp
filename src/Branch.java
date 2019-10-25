import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer>customers;

    public Branch(String name) {
        this.name=name;
        customers=new ArrayList<Customer>();

    }

    public String getName() {
        return name;
    }
    public Customer findCustomer(String name)
    { for(int i=0;i<customers.size();i++)
       {
           Customer CheckedCustomer= customers.get(i);
           if(CheckedCustomer.getName().equals(name)){
               return CheckedCustomer;
           }
       }
       return null;
    }

    public boolean newCustomer(String CustomerName,double Initamount)
    {   if(findCustomer(CustomerName)==null)
         {
             this.customers.add(new Customer(CustomerName,Initamount));
             return true;
         }
         return false;

    }

    public boolean addCustomerTransaction(String name ,double amount) {
        Customer existingCustomer=findCustomer(name);
        if(existingCustomer !=null)
        {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
