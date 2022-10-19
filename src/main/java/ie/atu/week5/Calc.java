package ie.atu.week5;

public class Calc {
    public int total;

    public Calc(){
        total=0;
    }

    public static int add(int x, int y){

        int total = x + y;
        System.out.println("The total of the two values together is: " + total);
        return total;
    }

    public static int multiply(int x, int y){

        int total = x*y;
        System.out.println("Total: "+total);
        return total;
    }
}
