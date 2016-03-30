/**
 * Created by Brittany on 3/29/16.
 */
public class Guppy {
    private String tailFinColor;
    private boolean isPregnant;
    private int gallonsOfFishTank;
    private int width;

    public Guppy(){
    }

    public Guppy(String finColor, int gallons, boolean pregnant){
        tailFinColor = finColor;
        gallonsOfFishTank = gallons;
        isPregnant = pregnant;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public String getTailFinColor() {
        return tailFinColor;
    }

    public void setTailFinColor(String tailFinColor) {
        this.tailFinColor = tailFinColor;
    }

    public boolean getIsPregnant() {
        return ( (width > 3) && (width < 6) );
    }

    public int getGallonsOfFishTank() {
        return gallonsOfFishTank;
    }

    public void setGallonsOfFishTank(int gallonsOfFishTank) {
        this.gallonsOfFishTank = gallonsOfFishTank;
    }


}
