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

    public Molly(String color){
        String fishColor = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //want it to display yes or no answer if true or otherwise when the code is run.
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
