class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("Test Running: ");

        System.out.print("Test 1 (Engine should be on): ");
        testStartCarWithCorrectKey();
        System.out.println(" ");

        System.out.print("Test 2 (Engine should be off): ");
        testTurnoffCar();
        System.out.println(" ");

        System.out.print("Test 3 (Key should make an error): ");
        keyError();
        System.out.println(" ");

        System.out.print("Test 4 (The Car should turn left/right): ");
        testSteering();
        System.out.println(" ");

        System.out.print("Test 5 (The throttleposition should be 1.0/max): ");
        testThrottle();
        System.out.println(" ");

        System.out.print("Test 6 (The Car should breake a little, 10.0 is max): ");
        testBreaks();
        System.out.println(" ");

        System.out.print("Test 7 (Current gear should be 0): ");
        testGears();
        System.out.println(" ");

        System.out.print("Test 8 (The car should NOT have a full tank of 1): ");
        useFuel();
        System.out.println(" ");

        System.out.print("Test 9 (The car should be Refueled): ");
        refuel();
        System.out.println(" ");
    }

    private static void useFuel() {
        Car renault = new Car();

        renault.fuel = renault.fuel - renault.fuelConsumption;
        System.out.print("Amount of fuel is "+ renault.fuel);
        System.out.println(" ");
    }

    private static void testThrottle() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");

        renault.throttlePosition = 1; //Vroooom! fuld fart
        System.out.print("Throttleposition is "+renault.throttlePosition);
        System.out.println(" ");
    }


    private static void testGears() {
        Car renault = new Car();

        renault.gear = 0;
        System.out.print("Current gearconfiguration is "+renault.gear);
        System.out.println(" ");
    }

    private static void testBreaks() {
        Car renault = new Car();

        renault.breakAmount = 2;
        System.out.print("The breakes are pushed "+renault.breakAmount+ " down");
        System.out.println(" ");
    }

    private static void refuel() {
        Car renault = new Car();

        renault.fuel = 1;
        System.out.print("Amount of fuel is "+ renault.fuel);
        System.out.println(" ");
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

    private static void testSteering() {
        Car renault = new Car();
        CarKey key = new CarKey("pass");

        renault.steeringAngle = 10; //Drej 10 grader mod højer
        System.out.print("Steering angle is "+renault.steeringAngle);
        System.out.println(" ");
    }


}