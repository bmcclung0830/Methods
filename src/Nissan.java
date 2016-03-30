/**
 * Created by Brittany on 3/29/16.
 */
public class Nissan {
    private String carType;
    private int horsepower;
    private String carColor;

    public Nissan (){

    }

    public Nissan(String carType, String carColor, int horsepower) {
        this.carType = carType;
        this.carColor = carColor;
        this.horsepower = horsepower;
    }


    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower( int power ) {
       this.horsepower = power;
    }

    public String getCarColor(){
        return carColor;
    }

    public void setCarColor( String color ) {
        this.carColor = color;
    }
}




