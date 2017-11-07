package Devices;

public class Light {

    String place;
    public Light(String place){
        this.place = place;
    }

    public void on(){
        System.out.println("light is on in " + place);
    }


    public void off(){
        System.out.println("light is off " + place);
    }
}
