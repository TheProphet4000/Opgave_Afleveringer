import java.util.Scanner;
public class MiniComputer {
    public static void main(String[] args) {
        System.out.println("Velkommen");

        //fori loop, køres 5 gange.
        for (int i = 0; i < 5; i++) {
            System.out.print("Hvilke miniprogram vil du køre [1....9]?: ");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            //if loop, souter fejl hvis indtasting er uden for tal rammen 1-9
            if (x < 1 || x > 9){
                System.out.println("FEJL: Input tal mellem 1-9");
            }
            //if loop, brug RandomJoke klasse metode grin
            if (x == 1) {
                ForLoop.Run();
            }


        }
        System.out.println("Farvel!");
    }
}
