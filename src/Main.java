public class Main {

    public static void main(String[] args) {
        StopLight newLight = new StopLight("red");
        Car newCar = new Car("red", "Mercedes", 150);


        for (int i = 0; i <= 30; i++) {
            char previous = 'y';
            if (newLight.isGreen()){
                newCar.go();
                newLight.setLightColor("yellow");
                previous = 'g';
            }
            if (newLight.isYellow()){
                newCar.slow();
                if (previous == 'y'){
                    newLight.setLightColor("red");
                }
                newLight.setLightColor("green");
            }
            if (newLight.isRed()){
                newCar.stop();
                newLight.setLightColor("green");
                previous = 'r';
            }
        }
    }
}
