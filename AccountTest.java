/*Create a class Account with the attributes account No - int, account Type - String,
accountBalance - int and methods setAccount Details() which set the values to these
attributes, withdraw() which subtracts the given amount from the available balance,
deposit() which adds given amount to the available balance and dispAccount Details()
which displays account No, accountType, accountBalance. Create a class Main1 which
contains main() method to test the functionality of Account class.*/

class Costumer {
    int cId;
    String cName;
    String cAddress;

    Costumer(int cId, String cName, String cAddress) {
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
    }


    public void display() {
        System.out.println(cId + "    " + cName + "   " + cAddress);
    }
}
class Account {
    int accId;
    String accType;
    String name;
    int accBalance;

    Account(int accId,String accType,String name,int accBalance){
        this.accId = accId;
        this.accType = accType;
        this. name = name;
        this.accBalance = accBalance;

    }

    public void dislpay() {
        System.out.println(accId + "  " + accType + "    " + name + "   " + accBalance);

    }
}
public class AccountTest{
    public static void main(String[] args){
        int count = 0;
        Costumer c1 = new Costumer(101,"Aparna","Bengaluru");
        Account a1 = new Account(201,"Saving Account","Avinash",1);
        c1.display();
        a1.dislpay();
    }

}



