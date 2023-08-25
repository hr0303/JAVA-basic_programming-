/*Create a class Account with the attributes account No - int, account Type - String,
accountBalance - int and methods setAccount Details() which set the values to these
attributes, withdraw() which subtracts the given amount from the available balance,
deposit() which adds given amount to the available balance and dispAccount Details()
which displays account No, accountType, accountBalance. Create a class Main1 which
contains main() method to test the functionality of Account class.*/

public class Account {
    int accNum;
    String accType;
    int accBalance;

//    public void setDetails(int accNum, String accType, int accBalance) {
    Account(int accNum, String accType, int accBalance) {
        this.accNum = accNum;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    public int withdraw( int withAmount) {
        accBalance = accBalance - withAmount;
        return accBalance;
    }

    public int deposit(int depoAmount) {
        accBalance = accBalance + depoAmount;
        return accBalance;
    }

    public void displayDetails() {
        System.out.println(accNum + " " + accType + " " + accBalance);
    }
}
public class AccountDemo{
    public static void main(String [] args){
        Account a1 = new Account(1001,"Current Account",1000);
//        a1.setDetails(1001,"Current Account",1000);
        a1.withdraw(500);
        a1.deposit(200);
        a1.displayDetails();

    }

}






