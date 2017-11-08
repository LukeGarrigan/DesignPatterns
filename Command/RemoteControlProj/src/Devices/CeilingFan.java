package Devices;

public class CeilingFan {

    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    String room;
    int speed;

    public CeilingFan(String room){
        this.room = room;
        speed = OFF;
    }

    public void high(){
        System.out.println("HIGH");
        speed = HIGH;
    }

    public void medium(){
        System.out.println("MEDIUM");
        speed = MEDIUM;
    }

    public void low(){
        System.out.println("LOW");
        speed = LOW;
    }

    public void off(){
        System.out.println("OFF");
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }
}
