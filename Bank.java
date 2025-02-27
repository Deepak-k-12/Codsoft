import java.util.*;

class BankAccount{
    double balance;
    
    public BankAccount(double initialBalance){
        this.balance=initialBalance;}

    public double getBalance(){
        return balance;}

    public boolean withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            return true;}
        return false;}

    public void deposit(double amount){
        if(amount>0){
        balance+=amount;}}
    }
class ATM{
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account){
        this.account=account;
        this.scanner=new Scanner(System.in);}

    public void showMenu(){
        while(true){
            System.out.println("\nATM Menu");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice=scanner.nextInt();
            if(choice==1){
            System.out.print("Enter amount to withdraw: ");
            double amount=scanner.nextDouble();
            if(account.withdraw(amount)){
            System.out.println("Withdrawal successful. Collect your cash.");}
            else{
            System.out.println("Invalid amount or insufficient balance.");}}
            else if(choice==2){
            System.out.print("Enter amount to deposit: ");
            double amount=scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit successful.");}
            else if(choice==3){
            System.out.println("Current Balance: $"+account.getBalance());}
            else if(choice==4){
            System.out.println("Thank you for using the ATM. Goodbye!");
            break;}
            else{
            System.out.println("Invalid option. Try again.");}}
        }
        }
    public class Bank{
    public static void main(String[] args){
        BankAccount userAccount=new BankAccount(1000.0);
        ATM atm=new ATM(userAccount);
        atm.showMenu();}
    }