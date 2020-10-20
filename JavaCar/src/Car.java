public class Car {

    private final String car_password;   //final? inellij sagde det var en god ide.
    public float breakAmount;

    public float throttlePosition;
    public float currentRpm;
    public float maxRpm;

    public float steeringAngle;

    public double gasConsumption;
    public double theTank;

    public short gear;
    public boolean engineOn = false;
    public float engineTempC;

    public boolean airconOn = false;
    public boolean lightsOn = false;

    Car() { //giver bilerne start atributter
        this.car_password = "pass";
        this.engineOn = false;
        this.throttlePosition = 0;
        this.currentRpm = 0;
        this.gasConsumption = 0.1;
        this.maxRpm = 3000;
        this.engineTempC = 15;
        this.theTank = 1;
        this.gear = 1;
        this.airconOn = false;
        this.lightsOn = false;
        this.steeringAngle = 0; //positive grader er til højer, samt negative er til venstre
        this.breakAmount = 0;
    }

    public void turnEngineOn(CarKey key) {

        if (key.key_password.equals(car_password)) {
            System.out.println("The engine is turned on ");
            engineOn = true;
            engineTempC = 100;

        } else { System.out.println("Can't start the engine due to password error "); }
    }

    public void turnEngineOff(CarKey key) {
        if (key.key_password.equals(car_password)) {
            System.out.println("The engine is turned off ");
            engineOn = false;
            engineTempC = 80;

        } else { System.out.println("You need the key to do anything, password error "); }
    }

    public void turnOnSecurityAndComfort(){
        airconOn = true;
        lightsOn = true;
    }

    public void turnOffSecurityAndComfort(){
        airconOn = false;
        lightsOn = false;
    }

    public void showCarStatus(){
        System.out.println("The engine is "+engineOn);
        System.out.println("The engine temperture in C is "+engineTempC);
        System.out.println("The position of the throttle is "+throttlePosition);
        System.out.println("Current RPM : "+currentRpm);
        System.out.println("The lights are "+lightsOn);
        System.out.println("The airconditioner is "+airconOn);
    }

    public void throttlePosition(float throttlePosition) {

        currentRpm = throttlePosition * 10;
        engineTempC = engineTempC * currentRpm + 10; //ikke realistisk men har ikke nogle kilder, eller bil

        if (currentRpm >= maxRpm){
            currentRpm = maxRpm;
            engineTempC = 200;
        }
        if (currentRpm <= 0){
            currentRpm = 0;
        }
    }
}
