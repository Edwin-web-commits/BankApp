import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch>branches;

    public Bank(String name) {
        this.name=name;
        this.branches=branches=new ArrayList<Branch>();;
    }


    private Branch findBranch(String Branchname)
    {
        for(int i=0;i<branches.size();i++)
       {
        Branch CheckedBranch= this.branches.get(i);
        if(CheckedBranch.getName().equals(Branchname))
           {
            return CheckedBranch;
           }
       }
        return null;
    }

    public boolean addBranch(String BranchName){
        if(findBranch(BranchName)==null)
        {
            branches.add(new Branch(BranchName));
            return true;
        }
        return false;
    }
   public boolean addCustomer(String BranchName,String Customername,double initAmount){
        Branch branch= findBranch(BranchName);
        if(branch !=null)
        {
            return branch.newCustomer(Customername,initAmount);
        }
        return false;
   }
   public boolean addCustomerTransaction(String BranchName,String Customername,double initAmount)
   {
       Branch branch=findBranch(BranchName);
       if(branch !=null)
       {
         return branch.addCustomerTransaction(Customername,initAmount);
       }
       return false;
   }

   public boolean listCustomers(String BranchName,boolean ShowTransactions)
   {
   Branch branch= findBranch(BranchName);
     if(branch !=null)
       {
         System.out.println("customer details for branch:" + branch.getName());


           ArrayList<Customer>branchCustomers=branch.getCustomers();
         for(int i=0;i<branchCustomers.size();i++)
            {
              Customer branchCustomer=branchCustomers.get(i);
              System.out.println("customer:"+branchCustomer.getName()+"[" + (i+1) + "]");
              if(ShowTransactions)
              {
                  System.out.println("Transactions");
                  ArrayList<Double>transaction=branchCustomer.getTransactions();
                  for(int j=0 ;j<transaction.size();j++)
                  {
                      System.out.println("["+(j+1) + "] amount" +transaction.get(j));
                  }
              }
            }
         return true;
       }
       else {
         return false;
         }

   }








}
