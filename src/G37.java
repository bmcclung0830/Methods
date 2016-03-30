/**
 * Created by Brittany on 3/29/16.
 */
public class G37 {
    private String carMake;
    private int crankHorsePower;
    private boolean carCleaned;
    private double sizeOfEngine;

    public G37() {

    }

    public G37(String make, int horsePower, boolean cleanCar, double engineSize) {
        this.carMake = make;
        this.crankHorsePower = horsePower;
        this.carCleaned = cleanCar;
        this.sizeOfEngine = engineSize;
    }

    public String getCarMake(){
        return carMake;
    }

    public void setCarMake(String make){
        carMake = make;
    }

    public int getCrankHorsePower() {
        return crankHorsePower;
    }

    public void setCrankHorsePower(int power) {
        this.crankHorsePower = power;
    }

    public boolean getCarCleaned() {
        return carCleaned;
    }

    public void setCarCleaned(boolean clean) {
        carCleaned = clean;
    }

    public double getSizeOfEngine() {
        return sizeOfEngine;
    }

    public void setSizeOfEngine(double engine) {
        this.sizeOfEngine = engine;
    }








}
