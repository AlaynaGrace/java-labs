/**
 * Created by alayn on 9/13/2016.
 */
public class BankAccount {
    private String name;
    private String password;
    private double balance;


    public void withdraw(String enteredPassword, double amount){
        if (password.equals(enteredPassword) && balance >= amount){
            balance = balance - amount;
        }
    }
    public void deposit(String enteredPassword, double amount) {
        if (password.equals(enteredPassword)) {
            balance = balance + amount;
        }
    }
    public double getBalance(String enteredPassword){
        if (password.equals(enteredPassword)){
            return balance;
        } else{
            return -1;
        }

    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public boolean setPassword(String oldPassword, String newPassword){
        if (password.equals(oldPassword)){
            password = newPassword;
            return true;
        } else {
            return false;
        }
    }
    public BankAccount(String initName, String initPassword, double initBalance){
        this.name = initName;
        this.password = initPassword;
        this.balance = initBalance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Java","CSCI1933 rules!", 100.50);
        //myAccount.password = "CSCI1933 rules!";
        myAccount.deposit("CSCI1933 rules!", 100.50);
        System.out.println("My account's balance is: " + myAccount.getBalance("CSCI1933 rules!"));

        //BankAccount myOtherAccount = new BankAccount();
        //myOtherAccount.password = "Hello!";
        //myOtherAccount.deposit("Hello!", 200);
        //myOtherAccount.withdraw("Hello!", 50);
        //System.out.println("My other account's balance is: " + myOtherAccount.balance);
    }


}
