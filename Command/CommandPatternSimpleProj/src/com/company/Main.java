package com.company;


import Commands.LightOnCommand;
import Devices.Light;

public class Main {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();




        Light light = new Light();
        LightOnCommand turnLightOn = new LightOnCommand(light);
        remote.setCommand(turnLightOn);
        remote.buttonWasPressed();
    }
}
