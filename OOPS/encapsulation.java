class BankAccount{
    private int Balance=100;
    public int getBalance(){
        return Balance;
    }
    public void setBalance(int amount){
        Balance +=amount;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setBalance(100);
        // int newBa =b1.Balance; //here Balance is Private we can't access here for that we use gets and seterd
        System.out.print(b1.getBalance());
    }
}
