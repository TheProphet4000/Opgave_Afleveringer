package MobBingo;

import java.util.Random;

public class Spawner {

    public static byte spawnAmount = 3;

    public static void main(String[] args) {
        randomAmount(spawnAmount);
        spawn(out);
    }

    private static byte randomAmount(byte spawnAmount) {
        Random rand = new Random();
        byte out = (byte) rand.nextInt(spawnAmount);
        return(out);
    }

    private static void spawn(byte out) {
        System.out.println(out + " Cows has spawned");
    }
}
