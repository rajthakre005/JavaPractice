import java.util.Scanner;
public class Overloading {
    //integer power
    static int power(int base,int exp){
        return (int) Math.pow(base,exp);
    }
    //double power
    static double power(double base,double exp){
        return (double) Math.pow(base,exp);
    }
    //float power
    static float power(float base, float exp){
        return (float) Math.pow(base,exp);
    }
    //absolute power in integer
    static int absolute(int base){
        return (int) Math.abs(base);
    }
    //absolute power in double
    static double absolute(double base){
        return (double) Math.abs(base);
    }
    //absolute power in float
    static float absolute(float base){
        return (float) Math.abs(base);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent for integer power: ");
        int baseInt = sc.nextInt();
        int expInt = sc.nextInt();
        System.out.println("Integer Power:"+power(baseInt,expInt));
        System.out.println("Absolute value of base:"+absolute(baseInt));

        System.out.println("\nEnter base and exponent for double power: ");
        double doubleBase = sc.nextDouble();
        double doubleExp = sc.nextDouble();
        System.out.println("Double Power:"+power(doubleBase,doubleExp));
        System.out.println("Absolute value of base:"+absolute(doubleBase));

        System.out.println("\nEnter base and exponent for float power: ");
        float floatBase = sc.nextFloat();
        float floatExp = sc.nextFloat();
        System.out.println("Float Power:"+power(floatBase,floatExp));
        System.out.println("Absolute value of base:"+absolute(floatBase));

        sc.close();
    }
    }

