/**
 * Created by erickivet on 6/28/16.
 */
public class Car {
    private String mColor;
    private String mBrand;
    private int mTopSpeed;

    public Car(){
        mColor = "none";
        mBrand = "none";
        mTopSpeed = 0;
    }

    public Car(String color, String brand, int topspeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed = topspeed;
    }

    public String go(){
        return "Go!";
    }

    public String slow(){
        return "Slow Down!";
    }

    public String stop(){
        return "Stop!";
    }

    public String getColor(){
        return mColor;
    }

    public String getBrand(){
        return mBrand;
    }

    public int getTopSpeed(){
        return mTopSpeed;
    }
}
