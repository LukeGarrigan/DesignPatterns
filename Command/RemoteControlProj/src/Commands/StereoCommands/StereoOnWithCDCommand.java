package Commands.StereoCommands;

import Commands.Command;
import Devices.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}