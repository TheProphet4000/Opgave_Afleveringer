import static java.lang.Math.PI;

public class BooleanAndIfElse {
    public static void main(String[] args) {
        System.out.println("3.2.2, 1:True 2:False 3:True 4:True 5:False ");
        System.out.println("3.2.3, nej du kan ikke lave en boolean om til en int");

        changePlaces();
        greaterThen90();
        FixedCode();
        GreaterThen90Part2();
    }

    public static void changePlaces(){
        byte x = 0;
        byte y = 2;

        if (y>0){
            x = 1;
        }
        System.out.println("3.3.1: x = "+x);
    }

    public static void greaterThen90(){

        double score = 100;
        double percentage = 3.0;
        double pay;

        if (score > 90){
            double x = score / 100; //Finder bet i %
            double y = x * percentage; // finder total procent
            pay = score + y; //lægger procenter til bet
            System.out.println("3.3.2: pay = "+ pay);
        }

    }

    public static void FixedCode() {
        //sådan her skal 3.3.3 se ud, med alle fejl rettet
        int radius = 5;
        double area;

        if (radius >= 0){
            area = radius * radius * PI;

            System.out.println("3.3.3: The area of the circle with the radius of " + radius + " is "+ area);
        }
    }

    public static void GreaterThen90Part2(){
        System.out.println("3.4.1: ");
    }
}
