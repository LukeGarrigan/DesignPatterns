package com.company;

import Commands.CeilingFanCommands.CeilingFanHighCommand;
import Commands.CeilingFanCommands.CeilingFanLowCommand;
import Commands.CeilingFanCommands.CeilingFanOffCommand;
import Commands.Command;
import Commands.GarageDoorCommands.GarageDoorDownCommand;
import Commands.GarageDoorCommands.GarageDoorUpCommand;
import Commands.LightCommands.LightOffCommand;
import Commands.LightCommands.LightOnCommand;
import Commands.MacroCommand;
import Commands.StereoCommands.StereoOffCommand;
import Commands.StereoCommands.StereoOnWithCDCommand;
import Devices.CeilingFan;
import Devices.GarageDoor;
import Devices.Light;
import Devices.Stereo;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //macroCommand();


        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        commandsWithLamdas();


    }

    public static void commandsWithLamdas(){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light bedroomLight = new Light("Bedroom");
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();


        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, bedroomLight::on, bedroomLight::off);

        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCd();
            stereo.setVolume(10);
        };

        remoteControl.setCommand(2, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(3, garageDoor::up, garageDoor::down);


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

    public static void macroCommand(){

        RemoteControl remote = new RemoteControl();
        Light light = new Light("living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();


        // on commands
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        // off commands
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);


        Command[] macroOn = {lightOnCommand, garageDoorUpCommand, stereoOnWithCDCommand};
        Command[] macroOff = {lightOffCommand, garageDoorDownCommand, stereoOffCommand};

        MacroCommand macroOnCommand = new MacroCommand(macroOn);
        MacroCommand macroOffCommand = new MacroCommand(macroOff);
        // assigning the buggers to the remote
        remote.setCommand(0, macroOnCommand, macroOffCommand);

        System.out.println("----pushing on----");
        remote.onButtonWasPushed(0);
        System.out.println("----pushing off----");
        remote.offButtonWasPushed(0);
        System.out.println("---undoing---");
        //remote.undoButtonWasPushed();








    }
}
