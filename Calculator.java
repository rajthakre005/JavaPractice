import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        int choice;
        char operator;
        do{
        System.out.println("Enter a number 1:");
        num1 = sc.nextDouble();
        System.out.println("Enter a number 2:");
        num2 = sc.nextDouble();
        System.out.println("Enter a operator +,-,*,/");
        operator = sc.next().charAt(0);
        switch(operator){
        case '+':
            System.out.println("Result:"+(num1 + num2));
            break;
        case '-':
            System.out.println("Result:"+(num1 - num2));
            break;
        case '*':
            System.out.println("Result:"+(num1 * num2));
            break;
        case '/':
            System.out.println("Result:"+(num1 / num2));
            break;
        default:
            System.out.println("Invalid Input");
        }
        System.out.println("Do you want to continue(1 for yes and 2 for no):");
        choice = sc.nextInt();
        }while(choice == 1);
        
    }
}