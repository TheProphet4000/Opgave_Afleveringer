class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("Test Running: ");

        System.out.print("Test 1 (Engine should be on): ");
        testStartCarWithCorrectKey();

        System.out.print("Test 2 (Engine should be off): ");
        testTurnoffCar();

        System.out.print("Test 3 (Key should make an error): ");
        keyError();

        System.out.print("Test 4 (The Car should go forward and turn left/right): ");
        testDriving();

        System.out.print("Test 5 (The Car should breake): ");
        testBreaks();

        System.out.print("Test 6 (The Car should go backward): ");
        testBackward();

        System.out.print("Test 7 (Refuel): ");
        refuel();

        System.out.println("Test 8 (Show the cars status): ");
        statusCheck();
    }

    private static void statusCheck() {
        Car renault = new Car();
        renault.showCarStatus();
    }

    private static void testBackward() {
        Car renault = new Car();
        renault.gear = 0;
    }

    private static void testBreaks() {
        Car renault = new Car();
        renault.breakAmount = 2;
    }

    private static void refuel() {
        Car renault = new Car();

    }

    private static void testStartCarWithCorrectKey() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");
        renault.turnEngineOn(key);
    }

    private static void testTurnoffCar() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");
        renault.turnEngineOff(key);
    }

    public static void keyError() {
        Car renault = new Car();
        CarKey key = new CarKey("Wrong");
        renault.turnEngineOn(key);
    }

    private static void testDriving() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");
        renault.throttlePosition(1); //Vroooom! fuld fart
        renault.steeringAngle = 10; //Drej 10 grader mod højer
    }


}