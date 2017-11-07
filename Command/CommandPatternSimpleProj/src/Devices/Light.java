package Devices;

public class Light {

    private boolean isLightOn;

    public void on(){
        System.out.println("Turning light on...");
        isLightOn = true;
    }

    public void off(){
        System.out.println("Turning light off...");
        isLightOn = false;
    }
}
