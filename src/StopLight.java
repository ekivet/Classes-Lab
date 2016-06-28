/**
 * Created by erickivet on 6/28/16.
 */


public class StopLight{
    private String mLightColor;

    public StopLight() {
        mLightColor = "none";
    }

    public StopLight(String color){
        mLightColor = color;
    }

    public Boolean isRed(){
        if(mLightColor == "red") {
            return true;
        }
    }

    public Boolean isYellow() {
        if (mLightColor == "yellow") {
            return true;
        }
    }

    public Boolean isGreen(){
        if (mLightColor == "green") {
            return true;
        }
    }

    public String setLightColor(String lightColor){
        if (lightColor.toLowerCase() == "green"){
            return "green";
        }
        if (lightColor.toLowerCase() == "red"){
            return "red";
        }
        if (lightColor.toLowerCase() == "yellow"){
            return "yellow";
        }
        return "input not valid";


    }
}
