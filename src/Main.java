public class Main {
  public static void main(String[] args)
  {   Bank bank=new Bank("FNB");

     bank.addBranch("FNB Vaal");

     bank.addCustomer("FNB Vaal","Edwin",15.00);
      bank.addCustomer("FNB Vaal","Zitha",25.00);
      bank.addCustomer("FNB Vaal","Clife",80.00);

      bank.addBranch("ABSA Witbank");

      bank.addCustomer("ABSA Witbank","Mpho",250.00);
      bank.addCustomer("ABSA Witbank","Simphy",25.00);
      bank.addCustomer("ABSA Witbank","Wendy",210.00);

      bank.addCustomerTransaction("ABSA Witbank","Mpho",23.00);
      bank.addCustomerTransaction("ABSA Witbank","Mpho",20.00);
      bank.addCustomerTransaction("ABSA Witbank","Wendy",13.00);

      bank.listCustomers("ABSA Witbank",true);


  }
}
