package Devices;

public class Stereo {

    private int volume;
    public Stereo(){
    }


    public void on(){
        System.out.println("Stereo is turned on..");
    }

    public void off(){
        System.out.println("Stereo is turned off..");
    }

    public void setCd(){
        System.out.println("Stereo is set to CD");
    }

    public void setDvd(){
        System.out.println("Stereo is set to DVD");
    }

    public void setRadio(){
        System.out.println("Stereo is set to Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo is set to 11 decibels");
    }
}
