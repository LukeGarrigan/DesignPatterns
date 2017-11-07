package Devices;

public class CeilingFan {


    String room;
    public CeilingFan(String room){
        this.room = room;
    }

    public void on(){
        System.out.println("Fan turned on in "+ room);
    }

    public void off(){
        System.out.println("Fan turned off in " + room);
    }
}
