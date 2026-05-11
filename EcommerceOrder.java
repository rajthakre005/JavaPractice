import java.util.Scanner;
class Product {
    String name;
    double price;
    int quantity;
Product(){
    name = "Unknown";
    price = 0;
    quantity = 0;
}
Product(String n,double p){
    name = n;
    price = p;
    quantity = 1;
}
Product(String n,double p,int q){
    name = n;
    price = p;
    quantity = q;
}
double getTotal(){
    return price * quantity;
}
}
public class EcommerceOrder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number of product: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];
        for(int i = 0;i<n;i++){
            System.out.println("\n Enter product "+(i+1)+" details");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            products[i] = new Product(name,price,quantity);
        }
        double totalAmount = 0;
        for(Product p: products){
            totalAmount = totalAmount + p.getTotal();
        }
        
        double discount = 0;
        
        if(totalAmount>5000) {
            discount = totalAmount * 0.20;
        }
        else if(totalAmount>2000){
            discount = totalAmount * 0.10;
        }
        
        double finalAmount = totalAmount - discount;
        System.out.println("Invoice");
        for(Product p:products) {
            System.out.println(p.name+" Price: "+p.price+" Quantity "+p.quantity+" Total "+p.getTotal());
        }
        
        System.out.println("Total Amount: "+totalAmount);
        System.out.println("Discount: "+discount);
        System.out.println("Final Amount"+finalAmount);
        
        sc.close();
    }
}