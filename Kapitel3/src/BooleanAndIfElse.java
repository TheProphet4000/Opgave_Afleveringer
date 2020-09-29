import static java.lang.Math.PI;

public class BooleanAndIfElse {
    public static void main(String[] args) {
        System.out.println("3.2.2, 1:True 2:False 3:True 4:True 5:False ");
        System.out.println("3.2.3, nej du kan ikke lave en boolean om til en int");

        changePlaces();
        greaterThen90();
        FixedCode();
        GreaterThen90Part2();
        WhatHappends();
        FixTheCode();
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

        double score = 1;
        double payout;

        if (score > 90){
            double percentage = 3.0;
            double x = score / 100; //Laver score om til procent
            double y = x * percentage; // finder total procent
            payout = score + y; //lægger procenter til bet

            System.out.println("3.4.2: Payout = "+ payout);

        } else {
            double percentage = 1.0;
            double x = score / 100; //Laver score om til procent
            double y = x * percentage; // finder total procent
            payout = score + y; //lægger procenter til bet

            System.out.println("3.4.2: Payout = "+ payout);
        }
    }

    public static void WhatHappends() {

        byte x = 3;
        byte y = 3;
        if (x > 2)if (y > 2) {int z = x + y;
        System.out.println("z is " + z);
        }else  System.out.println("x is " + x);
        System.out.println("3.5.2: x = 2, y = 3: Nothing is printed");
        System.out.println("3.5.2: x = 3, y = 2: prints x is 3");
        System.out.println("3.5.2: x = 3, y = 2: prints z is 6");
    }

    public static void FixTheCode(){

        int score = 80; //Variablen var ikke declared
        if (score >= 60)  System.out.println("3.5.3: D");
        else if (score >= 70)  System.out.println("3.5.3: C");
        else if (score >= 80)  System.out.println("3.5.3: B");
        else if (score >= 90)  System.out.println("3.5.3: A");
        else  System.out.println("F");
        System.out.println("3.5.3: The varible score was not declared");
    }
}
