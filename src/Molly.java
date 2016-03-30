/**
 * Created by Brittany on 3/29/16.
 */
public class Molly {
    private boolean isPregnant;
    private String fishColor;
    private double inchesLong;
    private double weight;

    public Molly(){
    }

    public double getInchesLong() {
        return inchesLong;
    }

    public void setInchesLong(double inches) {
        this.inchesLong = inches;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //want it to display true or false based on the boolean below.
    public boolean getIsPregnant(){
        return ( (weight > 3) && (weight < 6) );
    }

    public String getFishColor(){
        return fishColor;
    }

    public void setFishColor(String color){
        fishColor = color;
    }



}
