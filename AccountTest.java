/* Create a class Customer with the fields custld, custName and custAddress. Create a
method display() which displays the Customer details.
Create a class Account with the fields acctld, acctType, Customer and acctBalance.
Create a method display() which displays Account Details
Create a main class "AccountTest" to test the above classes
Note: Use constructors to set the values to the fields of the classes.*/

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



