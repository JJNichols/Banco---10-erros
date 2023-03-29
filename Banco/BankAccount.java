public class BankAccount {
  private String accountNumber;
  private Double balance;
  private String titleHolder;
  private String withdrawLimit;
  private Double withdrawing;

  
  public static double deposit(double depositAmount){
    double balance = 0.00;

    balance += depositAmount;
    return balance;


  }

  public static double withdraw(double CurrentBalance, double withdrawAmount){

    double balance = 0.00;
    balance = CurrentBalance;
    balance -= withdrawAmount;
    return balance;

  }

  public void printInformation(){
    System.out.println("What is your bank account number? " + accountNumber);
    System.out.println("What is your title name? " + titleHolder);
    System.out.println("What is the balance in the bank? " + balance);
    System.out.println("What is your withdraw limit? " + withdrawLimit);
    System.out.println("I am doing to witdraw " + 200  + " dollars out of my bank.");
    System.out.println("There are " + withdrawing + " dollars in my bank right now.");

  }

    public static void main (String[] arg){

      double balanceAmt = 500.00;
      double withdrawBalance = 200;

      double balanceCall = deposit(balanceAmt);

      double withdrawCall = withdraw(balanceCall, withdrawBalance);

      BankAccount myAccount = new BankAccount();
      myAccount.accountNumber = "36978-7";
      myAccount.titleHolder = "Jason John Nichols";
      myAccount.withdrawLimit = "400";
      myAccount.balance = balanceCall;
      myAccount.withdrawing = withdrawCall;
      
     
   
      
      myAccount.printInformation();
    }
    
}




 
  

  