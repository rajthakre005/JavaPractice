import java.util.Scanner;
class ATM{
    private double balance;
    //Constructor
    ATM(double initialbalance){
        balance = initialbalance;
    }

    void checkBalance(){
        System.out.println("Current Balance ₹:"+balance);
    }
    void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Invalid deposit amount!");
        }
        balance = balance + amount;
        System.out.println("₹" + amount + " deposited successfully");
    }
    void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid withdrawal amount!");
        }
        if(amount>balance){
            throw new ArithmeticException("Insuffient balance!");
        }
        balance = balance - amount;
        System.out.println("₹ " + amount + " withdrawn successfully");
    }

}
public class ATMSimulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(5000);
        int choice;
        do { 
            System.out.println("\n ATM MENU \n");
            System.out.println("1. Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            try {
                switch(choice){
                    case 1 :
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = sc.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.println("enter amount to withdraw:");
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 4 :
                        System.out.println("Thank you for using ATM");
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid menu choice");
                }
            } catch(ArithmeticException e){
                System.out.println("Error " + e.getMessage());
            } catch(IllegalArgumentException e){
                System.out.println("Error"+e.getMessage());
            } catch(Exception e){
                System.out.println("Invalid input please enter a correct data");
            } finally{
                System.out.println("Transaction processed.\n");
            }
        } while (choice != 4);
        sc.close();
    } 
}