package com.company;

import Commands.CeilingFanCommands.CeilingFanOffCommand;
import Commands.CeilingFanCommands.CeilingFanOnCommand;
import Commands.GarageDoorCommands.GarageDoorDownCommand;
import Commands.GarageDoorCommands.GarageDoorUpCommand;
import Commands.LightCommands.LightOffCommand;
import Commands.LightCommands.LightOnCommand;
import Commands.StereoCommands.StereoOffCommand;
import Commands.StereoCommands.StereoOnWithCDCommand;
import Devices.CeilingFan;
import Devices.GarageDoor;
import Devices.Light;
import Devices.Stereo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        // creating all the light command objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // creating the fan command objects
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // creating the garage up and down command objects
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        // stereo on and off command objects
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);



        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }
}
