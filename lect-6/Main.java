class bank_account{
     public
     double acc_number;
     String acc_holder;
     double balance;

     double deposit_money(double deposit)
     {  
               balance=balance+deposit;
               return balance;
     }
     double withdraw_money(double withdraw)
     {  
               balance=balance-withdraw;
               return balance;
     }


}

public class Main{
    public static void main(String[] args)
     {
     bank_account b1= new bank_account();
     b1.acc_number=12356;
     b1.acc_holder="harshita jain";
     b1.balance=10000;
     b1.deposit_money(100);
    // b1.withdraw_money(20000);
     System.out.println("account number-" +b1.acc_number);
     System.out.println(b1.acc_holder);
     
     System.out.println(b1.balance);
     


     }
}
